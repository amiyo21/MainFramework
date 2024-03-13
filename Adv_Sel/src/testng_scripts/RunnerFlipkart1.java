package testng_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerFlipkart1 extends GenericFlipkart {
	@Test
	public void searchItem() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png']")).click();
	}
	

}
