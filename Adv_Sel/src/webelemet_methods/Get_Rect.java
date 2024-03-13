package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		Rectangle rect = driver.findElement(By.id("email")).getRect();
		System.out.println(rect);
		int x = rect.getX();
		int y = rect.getY();
		System.out.println("The x cooddinate is:"+x);
		System.out.println("The y coordinate is :"+y);
	}

}
