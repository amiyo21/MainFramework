package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinAuth_Autoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\ADTS\\Documents\\QspidersSelenium\\autoit_files\\WinAuth.exe");
		
		
		
	}

}
