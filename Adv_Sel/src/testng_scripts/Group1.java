package testng_scripts;

import org.testng.annotations.Test;

@Test(groups= {"g1"})
public class Group1 {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Hello India");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test2()
	{
		System.out.println("Hello Asia");
	}
	
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("Hello World");
	}

}
