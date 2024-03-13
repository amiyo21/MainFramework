package testng_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnerExample {
	@Test
	public void compose()
	{
		System.out.println("Message Composed");
	}
	
	@Test
	public void sentItems()
	{
		System.out.println("Message Sent");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="sentItems")
	public void trash()
	{
		System.out.println("Message Deleted");
	}
	

}
