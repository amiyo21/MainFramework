package testng_scripts;

import org.testng.annotations.DataProvider;

public class DataProv {
	@DataProvider(name="LoginCredential")
	public Object[][] getData()
	{
		Object[][] data= {{"santosh@gmail.com","123"},{"pradeep@gmail.com","456"},{"rahul@gmail.com","789"}};
		return data;
	}

}
