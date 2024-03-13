package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.cssSelector("input[name='username']"));
		ele.sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Selenium123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
