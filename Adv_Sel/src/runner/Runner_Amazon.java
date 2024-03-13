package runner;

import org.testng.annotations.Test;

import generic.LaunchAmazon;
import pom.Pom_Amazon;

public class Runner_Amazon extends LaunchAmazon
{
	@Test
	public void runAmazon() throws InterruptedException
	{
		
		Pom_Amazon p1=new Pom_Amazon(driver);
		Thread.sleep(3000);
		p1.passSearchTxt("mobile");
		p1.clickSearch();
		
		Thread.sleep(3000);
		
		
	}

}
