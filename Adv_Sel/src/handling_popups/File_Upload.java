package handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/fileupload.html");
		
		Thread.sleep(3000);
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\ADTS\\Documents\\QspidersSelenium\\fileupload.html");
		
	}

}
