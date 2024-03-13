package webelemet_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDD_Check {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/SingleSDD.html");
		Thread.sleep(3000);
		WebElement dd=driver.findElement(By.id("Menu"));
		
		Select sel=new Select(dd);
		boolean b=sel.isMultiple();
		if(b)
		{
			System.out.println("Multiselect Dropdown");
		}
		else
		{
			System.out.println("Single select Dropdown");
		}
		
	}

}
