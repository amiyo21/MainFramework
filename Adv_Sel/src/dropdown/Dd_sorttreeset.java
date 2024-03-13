package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dd_sorttreeset {
	@Test
	public void sortDdOptions_reverse() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("month"));
		
		Select sel=new Select(ele);
		List<WebElement> opts = sel.getOptions();
		
	
		
		TreeSet<String> ts= new TreeSet<String>(Collections.reverseOrder());
		for(WebElement ele1:opts)
		{
			String txt=ele1.getText();
			ts.add(txt);
		}
		
		System.out.println(ts);
		
		//Collections.reverseOrder();
		//System.out.println(ts);		
	}
	
	

}
