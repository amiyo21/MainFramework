package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Insert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/DemoPage.html");
		Thread.sleep(3000);
		String title = driver.getTitle();
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		if(ele.isEnabled())
		{
			System.out.println("The text field is enabled");
			ele.sendKeys(title);
		}
		else
		{
			System.out.println("It is disabled");
		}
		
		
		Thread.sleep(6000);
		driver.close();
	}

}
