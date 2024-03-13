package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tooltip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		String attv = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).getAttribute("title");
		System.out.println(attv);
	}

}
