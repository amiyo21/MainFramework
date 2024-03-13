package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_url {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//Empty Browser
		WebDriver driver=new ChromeDriver();
		
		//launch an url using get
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		// Open an URL using navigate method
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		
		//backward action
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward action
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh page
		
		driver.navigate().refresh();
		Thread.sleep(1000);
				
		driver.close();
		
	}

}
