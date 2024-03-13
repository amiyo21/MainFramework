package testng_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_title extends GenericQspider {
	@Test
	public void checkTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DemoApps | Qspiders");
		System.out.println("Assertion Passed");
		
	}
	@Test
	public void checkPartialTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("DemoApps"));
		System.out.println("Assertion Passed for partially dynamic Title");
		
	}
	

}
