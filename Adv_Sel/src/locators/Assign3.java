package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);		
		WebElement ele=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		ele.sendKeys("jbl headphones");
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='https://m.media-amazon.com/images/I/61kFL7ywsZS._AC_UY218_.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='submit.add-to-cart']")).click();
		
	}

}
