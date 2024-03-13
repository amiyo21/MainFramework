package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		Dimension d= new Dimension(500,750);
		
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.close();
	}

}
