package testng_scripts;

import org.testng.annotations.Test;

public class DataProvRunner {
	@Test(dataProvider = "LoginCredential",dataProviderClass = DataProv.class)
	public void loginTest(String un, String pwd)
	{
		System.out.println(un+"  "+pwd);
	}
	

}
