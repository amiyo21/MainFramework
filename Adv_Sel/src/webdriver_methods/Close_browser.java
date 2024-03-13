package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_browser {

	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		Thread.sleep(5000);
		driver.close(); //close the tab
		driver.quit(); //close the browser
		// TODO Auto-generated method stub

	}

}
