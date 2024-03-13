package testng_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameter_priority {
	@Test(priority=1)
	public void LaunchFB() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("Browser Launched",true);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		
	}
	@Test()
	public void CallFB() throws InterruptedException
	{
		Parameter_priority p=new Parameter_priority();
		Reporter.log("Browser Launched",true);
		p.LaunchFB();
		
		
	}
	@Test(dependsOnMethods = "LaunchFB")
	public void display() throws InterruptedException
	{
		
		Reporter.log("FB launched twice",true);
		
	}
	
	

}
