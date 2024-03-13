package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("URL is correct");
		}
		else
		{
			System.out.println("URL is incorrect");
		}
	}

}
