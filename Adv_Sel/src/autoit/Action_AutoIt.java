package autoit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_AutoIt {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\ADTS\\Documents\\QspidersSelenium\\autoit_files\\redbus_allow.exe");
		
		Thread.sleep(3000);
		driver.close();
	}

}
