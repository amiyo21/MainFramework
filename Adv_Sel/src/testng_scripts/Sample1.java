package testng_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void launchFireFace() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Reporter.log("Hello", true);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Reporter.log("Selenium", true);
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test
	public void launchFireInsta() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Reporter.log("Hello", true);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Reporter.log("Selenium", true);
		Thread.sleep(3000);
		driver.close();
		
	}

}
