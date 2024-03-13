package java_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Page_UpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver; //To execute Java Script typecast from webdriver to JavaScriptExecutor
		
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
		}
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(0,-250)");
			Thread.sleep(2000);
		}
	}

}
