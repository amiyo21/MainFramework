package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Check {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/check.html");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.id("cbox"));
		if(ele.isDisplayed())
		{
			System.out.println("It is displayed");
			if(ele.isEnabled())
			{
				System.out.println("It is enabled");
				if(ele.isSelected())
				{
					System.out.println("It is selected");					
				}
				else
				{
					System.out.println("It is not selected");
					ele.click();
				}
				
			}
			else
			{
				System.out.println("It is not enabled");
			}
			
		}
		else
		{
			System.out.println("It is not displayed");
			
		}
	}

}
