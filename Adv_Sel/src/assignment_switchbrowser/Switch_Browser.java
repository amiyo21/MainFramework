package assignment_switchbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch_Browser {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='About']"));
				
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@href='/downloads']"));
		
		act.contextClick(ele1).perform();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		WebElement ele2 = driver.findElement(By.xpath("//a[@href='/documentation']"));
		act.contextClick(ele2).perform();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		WebElement ele3 = driver.findElement(By.xpath("//a[@href='/projects']"));
		act.contextClick(ele3).perform();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		WebElement ele4 = driver.findElement(By.xpath("//a[@href='/support']"));
		act.contextClick(ele4).perform();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> arr_id=new ArrayList<String>(all_ids);
		String bid1 = arr_id.get(0);
		String bid2 = arr_id.get(1);
		String bid3 = arr_id.get(2);
		String bid4 = arr_id.get(3);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(bid1);
		Thread.sleep(2000);
		driver.switchTo().window(bid2);
		Thread.sleep(2000);
		driver.switchTo().window(bid3);
		Thread.sleep(2000);
		driver.switchTo().window(bid3);
		
		
	}

}
