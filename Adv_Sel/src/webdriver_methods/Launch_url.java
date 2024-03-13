package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_url {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
	}

}
