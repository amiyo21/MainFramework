package testng_scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic_script.FrameWork_Constants;
import utils.FetchProp;

public class LaunchFB implements FrameWork_Constants {
	public WebDriver driver;
	@BeforeMethod
	public void launchFB() throws FileNotFoundException, IOException
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.get(FetchProp.getProp());
		
	}
	
	@AfterMethod
	public void closeFB()
	{
		driver.close();
	}
	

}
