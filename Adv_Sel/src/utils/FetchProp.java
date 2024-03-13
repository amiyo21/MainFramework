package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class FetchProp {
	@Test
	public static String getProp() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./fbprop.properties"));
		String val=p.getProperty("bURL");
		return val;
		
	}

}
