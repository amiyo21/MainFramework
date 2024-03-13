package java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disbaled_textfield {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Disabled.html");
		Thread.sleep(3000);
		driver.findElement(By.id("i1"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1').value='ABC';");
	}

}
