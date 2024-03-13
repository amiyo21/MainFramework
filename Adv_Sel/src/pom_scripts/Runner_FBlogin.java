package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_FBlogin {
	@Test
	public void fbLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Pom_FBLogin p = new Pom_FBLogin(driver);
		p.passUname("Qspider");
		Thread.sleep(3000);
		
		p.passPwd("Selenium");
		Thread.sleep(3000);
		
		p.clickLogin();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
