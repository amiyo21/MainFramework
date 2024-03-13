package testng_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void launchFireFace1() throws InterruptedException
	{
		Sample1 s1= new Sample1();
		s1.launchFireFace();
		
		Reporter.log("Sample1 Face method called", true);
		
		
	}
	@Test
	public void launchFireInsta2() throws InterruptedException
	{
		
		Sample1 s1= new Sample1();
		s1.launchFireInsta();
		
		Reporter.log("Sample1 Instamethod called", true);
	}

}
