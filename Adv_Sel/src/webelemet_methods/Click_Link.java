package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Link.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("google")).sendKeys(Keys.ENTER);
		//Without using click()  method , click the link
	}

}
