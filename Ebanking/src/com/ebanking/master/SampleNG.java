package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{

	WebDriver driver;
	
	@BeforeMethod
	public void LaunchFF() throws InterruptedException 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void BUrl() throws InterruptedException
	{
		driver.get("http://103.211.39.246/ranford2");
	    Thread.sleep(5000);
	}
	@Test
	public void Url() throws InterruptedException
	{
		driver.get("http://www.google.com");
	    Thread.sleep(3000);
	}
	@AfterMethod
	public void Aclose()
	{
	driver.close();	
	}
}
