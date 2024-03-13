package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Op {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Task.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).clear();		
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("MANAGER");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("i3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("i4")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
