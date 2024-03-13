package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap_textbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/swap.html");
		Thread.sleep(3000);
		driver.findElement(By.id("tx1")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.findElement(By.id("tx1")).sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		driver.findElement(By.id("tx3")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tx2")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.findElement(By.id("tx2")).sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		driver.findElement(By.id("tx1")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tx3")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.findElement(By.id("tx3")).sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		driver.findElement(By.id("tx2")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.findElement(By.id("tx3")).clear();

		
	}

}
