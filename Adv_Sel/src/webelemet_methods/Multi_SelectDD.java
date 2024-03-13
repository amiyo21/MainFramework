package webelemet_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_SelectDD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADTS/Documents/QspidersSelenium/SingleSDD.html");
		Thread.sleep(3000);
		WebElement dd=driver.findElement(By.id("Menu"));
		
		Select sel=new Select(dd); 
		
		List<WebElement> opts = sel.getOptions(); //get all options of DD into a list
		int count = opts.size();  //get size of the list of option
		System.out.println(count); //get the count
		for(WebElement opt:opts)
		{
			String txt = opt.getText();  //get the text of each option in DD
			System.out.println(txt);
		}
	}

}
