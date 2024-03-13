package launchy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFire {
	
	public static void launchChrome()
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}
	
	public static void launchFirefox()
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver= new FirefoxDriver();
	}
	
	public static void launchEdge()
	{
		String key="webdriver.edge.driver";
		String value="./softwares/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver= new EdgeDriver();
	}

	public static void main(String[] args) {
		
		launchChrome();
		launchFirefox();
		launchEdge();
		
		
		// TODO Auto-generated method stub

	}

}
