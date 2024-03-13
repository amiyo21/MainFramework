package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Ops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		Thread.sleep(5000);
		
		//fetch title
		String title= driver.getTitle();
		System.out.println(title);
		
		//fetch current URL
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//fetch source code
		
		String src = driver.getPageSource();
		System.out.println(src);
		
				
		driver.close(); //close the tab
		//driver.quit(); //close the browser
		

	}

}
