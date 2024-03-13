package webelemet_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultipleElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:links)  //Enhance for Loop or For each loop to get all the elements of the collection/list
		{
			String href = link.getAttribute("href");
			System.out.println(href);
		}
	}

}
