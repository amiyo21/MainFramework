package testng_scripts;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class Listener1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case skipped");
	}

	

	

}
