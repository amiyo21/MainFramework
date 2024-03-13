package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_Xpath {
	public static void main(String[] args) throws InterruptedException {
		//Xpath by Attribute
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/CSS.html");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//input[@id='user']"));
		ele.sendKeys("Hello Selenium");
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com']")).click();
		Thread.sleep(2000);
		
		
		
	}

}
