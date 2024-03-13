package java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Disabled_checkbox.html");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.name("n1"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
		Thread.sleep(5000);
		jse.executeScript("arguments[0].click();",ele);
	}

}
