package testng_scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class RunnerFB {
	@Test
	public void runFB() throws FileNotFoundException, IOException
	{
		LaunchFB l= new LaunchFB();
		l.launchFB();
		
	}

}
