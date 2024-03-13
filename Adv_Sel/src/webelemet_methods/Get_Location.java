package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		Point loc = driver.findElement(By.id("email")).getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("The x cooddinate is:"+x);
		System.out.println("The y coordinate is :"+y);
		
	}

}
