package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Xpath.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("Selenium Selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[3]/a")).click();
		

	}

}
