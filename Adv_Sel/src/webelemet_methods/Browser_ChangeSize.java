package webelemet_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_ChangeSize {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	
	Dimension d= new Dimension(400,600);
	
	driver.manage().window().setSize(d);
	
	Thread.sleep(6000);
	driver.close();
	}

}
