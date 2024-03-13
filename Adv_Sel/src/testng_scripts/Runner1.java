package testng_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends GenericScript {
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void removeCred() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("system");
		driver.findElement(By.id("pass")).sendKeys("manager");
		
		driver.findElement(By.name("login")).click();
	}

}
