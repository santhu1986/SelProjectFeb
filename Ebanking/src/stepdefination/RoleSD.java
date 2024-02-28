package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{

	WebDriver driver;

@Given("^Tester should on Ranford Home Page$")
public void tester_should_on_Ranford_Home_Page() throws Throwable 
{
	        driver=new FirefoxDriver();
		
			//Maximise
			
			driver.manage().window().maximize();
			
			//URL
			
			driver.get("http://103.211.39.246/ranford2/");
		
}

@When("^Tester Should enter Login Details$")
public void tester_Should_enter_Login_Details() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Mindq@Sys");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	
}

@Then("^Tester Click on Role button$")
public void tester_Click_on_Role_button() throws Throwable 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();

}

@When("^Tester click on NewRole button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_click_on_NewRole_button_and_enters_and(String RN, String RT) throws Throwable
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(RN);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();

}

@Then("^Tester Close the Application$")
public void tester_Close_the_Application() throws Throwable 
{
    driver.close();
}


}
