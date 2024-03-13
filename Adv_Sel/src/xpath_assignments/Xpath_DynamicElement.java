package xpath_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_DynamicElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.bollymoviereviewz.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Bollywood Box Office']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//strong[text()='Hanu Man (Hindi)']/../../../td[2]"));
		System.out.println(ele.toString());
	}

}
