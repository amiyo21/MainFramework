package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_xpathMultiple {
	public static void main(String[] args) throws InterruptedException {
		
		//Xpath by Multiple Attribute
				System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/Xpath_multAtt.html");
				Thread.sleep(2000);
				WebElement ele= driver.findElement(By.xpath("//input[@type='text' and @id='i1' and @name='n1']"));
				ele.sendKeys("Hello Selenium");
				Thread.sleep(2000);
				ele.clear();
				Thread.sleep(2000);
				
	}

}
