package testng_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic_script.Generic_page_photo;

public class GenericScript {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_page_photo.get_photo(driver);
		}
		driver.close();
	}

}
