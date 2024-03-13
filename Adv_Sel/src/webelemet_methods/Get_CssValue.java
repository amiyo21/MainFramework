package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String fntsize = link.getCssValue("font-size");
		System.out.println(fntsize);
		String ff = link.getCssValue("font-family");
		System.out.println(ff);
	}

}
