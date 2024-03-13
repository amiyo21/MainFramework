package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerScript1 {
	@Test
	public void fbLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Pom_Script1 p = new Pom_Script1(driver);
		p.passData();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		p.passData();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
