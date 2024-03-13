package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAmazon {
	public WebDriver driver;
	@BeforeMethod
	public void launchAmzn()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
