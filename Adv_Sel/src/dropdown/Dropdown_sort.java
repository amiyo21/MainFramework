package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_sort {
	@Test
	public void sortDdOptions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("month"));
		
		Select sel=new Select(ele);
		List<WebElement> opts = sel.getOptions();
		
	
		
		ArrayList<String> l= new ArrayList<String>();
		for(WebElement ele1:opts)
		{
			String txt=ele1.getText();
			l.add(txt);
		}
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);		
		
		
		
	}

}
