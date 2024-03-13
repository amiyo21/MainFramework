package java_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver; //To execute Java Script typecast from webdriver to JavaScriptExecutor
		jse.executeScript("window.scrollBy(0,500)");
	}

}
