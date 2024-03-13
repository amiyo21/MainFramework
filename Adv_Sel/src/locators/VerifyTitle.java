package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Title is corect");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
	}

}
