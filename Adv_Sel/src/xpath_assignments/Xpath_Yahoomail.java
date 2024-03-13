package xpath_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Yahoomail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.mail.yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("amiya1.qspider");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Stay signed in']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Qspiders@21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("amiya2.qspider@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='compose-subject-input']")).sendKeys("Selenium Assignment");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hey this is test email");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		
	}

}
