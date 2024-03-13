package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/CSS.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.cssSelector("input[type='text']"));
		ele.sendKeys("Selenium");
		Thread.sleep(2000);
		ele.clear();
		driver.findElement(By.cssSelector("a[href='https://www.facebook.com']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
