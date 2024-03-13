package autoit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Autoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/fileupload.html");
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\ADTS\\Documents\\QspidersSelenium\\autoit_files\\FileUpload.exe");
	
		//driver.close();
	}

}
