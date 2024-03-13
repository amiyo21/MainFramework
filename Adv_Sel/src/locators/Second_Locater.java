package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Locater {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Locator2.html");
		Thread.sleep(2000);
		//driver.findElement(By.id("face")).click();
		WebElement ele= driver.findElement(By.id("face"));
		ele.click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
