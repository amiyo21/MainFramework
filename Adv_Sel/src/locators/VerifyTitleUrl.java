package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleUrl {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		String title=driver.getTitle();		
		String url = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);
		
		if(title.equals("Forgotten Password | Can't Log In | Facebook"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		if(url.equals("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0"))
		{
			System.out.println("URL is correct");
		}
		else
		{
			System.out.println("URL is incorrect");
		}
	
	}

}
