package capture_screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_script.Generic_page_photo;

public class Capture_ScreenshotPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		Generic_page_photo.get_photo(driver);
		
		Thread.sleep(3000);
		Generic_page_photo.get_photo(driver);
		
	}

}
