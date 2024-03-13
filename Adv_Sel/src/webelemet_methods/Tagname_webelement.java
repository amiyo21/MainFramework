package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_webelement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Link.html");
		String tname = driver.findElement(By.linkText("google")).getTagName();
		System.out.println(tname);
	}

}
