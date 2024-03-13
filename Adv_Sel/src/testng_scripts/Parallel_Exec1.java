package testng_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_scripts.Pom_FBLogin;

public class Parallel_Exec1 {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void exec(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver1.exe");
		
				
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			
			Pom_FBLogin p1 = new Pom_FBLogin(driver);
			
			p1.passUname("Qspider");
			Thread.sleep(3000);
			
			p1.passPwd("Selenium");
			Thread.sleep(3000);
			
			p1.clickLogin();
		}
		else if (browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
			Pom_FBLogin p2 = new Pom_FBLogin(driver);
			p2.passUname("Qspider");
			Thread.sleep(3000);
			
			p2.passPwd("Selenium");
			Thread.sleep(3000);
			
			p2.clickLogin();
		}
		else
		{
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
			
			Pom_FBLogin p3 = new Pom_FBLogin(driver);
			
			p3.passUname("Qspider");
			Thread.sleep(3000);
			
			p3.passPwd("Selenium");
			Thread.sleep(3000);
			
			p3.clickLogin();
		}
	}

}
