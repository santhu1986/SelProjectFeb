package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasisScript {

	public static void main(String[] args) throws InterruptedException 
	{
	   
		String Expval="Ranford Bank";
		
		//Launch FF Browser
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://103.211.39.246/ranford2/");
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Ranford Application Launch Succ");
		}
		else
		{
            System.out.println("Ranford Application Failed to Launch");			
		}
		
		//Get Title
		
		//System.out.println(driver.getTitle());
		
		//String Tit=driver.getTitle();
		//System.out.println(Tit);
		
		// Admin Login
		
		Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Mindq@Sys");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
					System.out.println("Admin Login Succ");
				}
				else
				{
		            System.out.println("Admin Failed to Login");			
				}
				
		// Branch Creation
		
		Expval="Sucessfully";
				
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("MqHyderabadghfj");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ammerpet");
		driver.findElement(By.id("txtZip")).sendKeys("58795");
		
		//Drop Down
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		WebElement StateDD=driver.findElement(By.id("lst_stateI"));
		
		Select State=new Select(StateDD);
		State.selectByVisibleText("Delhi");
		
		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("Delhi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(3000);
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		    System.out.println("Branch created");	
		}
		else
		{
			System.out.println("Branch Name Already Exist");
		}
		
		driver.switchTo().alert().accept();
		
	    // Role Creation
		
		// Employee Creation
		
		// Banker Login
		
		
	}

}
