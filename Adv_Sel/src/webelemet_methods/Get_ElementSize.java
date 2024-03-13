package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_ElementSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		Dimension size = driver.findElement(By.id("email")).getSize();
		System.out.println(size);
		int h = size.getHeight();
		int w = size.getWidth();
		System.out.println("The height is:"+h);
		System.out.println("The width is :"+w);
		
		
	}

}
