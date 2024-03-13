package testng_scripts;

import org.testng.annotations.Test;

@Test(groups= {"g1"})
public class Group2 {
	@Test
	public void test1()
	{
		System.out.println("Running groups of classes");
	}

}
