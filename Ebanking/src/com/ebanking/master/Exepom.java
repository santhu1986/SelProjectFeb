package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom
{
	
	WebDriver driver;
	
    @BeforeTest
	public void Login() throws InterruptedException 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://103.211.39.246/ranford2/");
		
		//Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login();
	}
    
    @Test
    public void Rcreation() throws InterruptedException, IOException 
    {
    	
FileInputStream FIS=new FileInputStream("D:\\SeleniumPRJEvng\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		// Work Book
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("RData");
		
		//Row Count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations ----------------- Loop
		
		for (int i=1;i<=Rc;i++)
		{
             // Rows
			
			XSSFRow WR=WS.getRow(i);
			
			//Cells
			
			XSSFCell Wc=WR.getCell(0);
			XSSFCell Wc1=WR.getCell(1);
			
			XSSFCell Wc2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=Wc.getStringCellValue();
			String Rty=Wc1.getStringCellValue();
		
    	
		//Role
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		//New Role
		
		RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
		RD.NRole();
		Thread.sleep(3000);
		//Role Creation
		
		RoleCreation Rcre=PageFactory.initElements(driver,RoleCreation.class);
		Rcre.Rolecre(Rname,Rty);
		Thread.sleep(3000);
		//Alert
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//Home
		
		RD.Rhome();
	
	}
    }
}