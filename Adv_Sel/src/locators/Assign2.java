package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.cssSelector("input[id='search']"));
		ele.sendKeys("ddlj");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("a[title='Ho Gaya Hai Tujhko | Full Song | Dilwale Dulhania Le Jayenge, Shah Rukh Khan, Kajol, Lata Mangeshkar']")).click();
		
		//Thread.sleep(15000);
		//driver.close();

	}

}
