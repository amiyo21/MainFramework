package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/MainFramePage.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement T1 = driver.findElement(By.id("t1"));
		T1.sendKeys("abc");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement T2 = driver.findElement(By.id("t2"));
		T2.sendKeys("xyz");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement T3 = driver.findElement(By.id("t3"));
		T3.sendKeys("pqr");
		Thread.sleep(3000);
		
		T3.clear();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		T2.clear();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		T1.clear();
		Thread.sleep(2000);
		
		
		

	}

}
