package com.ebanking.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException
	{
	
		//Instance Class
		
        Library LB=new Library();
		
		LB.OpenApp("http://103.211.39.246/ranford2");
		LB.AdminLgn("Admin","Mindq@Sys");
		
		// To Get Test Data Excel file
		
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
			
	    	String Res=LB.Role(Rname,Rty);
	    	System.out.println(Res);
	         
	    	Wc2.setCellValue(Res);
	    	
	    	
	    }
		
		//Results
		
		FileOutputStream Fos=new FileOutputStream("D:\\SeleniumPRJEvng\\Ebanking\\src\\com\\ebanking\\results\\Res_role.xlsx");
		WB.write(Fos);
		WB.close();
	}

}
