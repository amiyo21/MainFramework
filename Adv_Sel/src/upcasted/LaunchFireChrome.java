package upcasted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireChrome {
	
	public static void launchChrome()
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	}
	
	public static void launchFirefox()
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new FirefoxDriver();
	}

	public static void main(String[] args) {
		
		launchChrome();
		launchFirefox();
		
	}

}
