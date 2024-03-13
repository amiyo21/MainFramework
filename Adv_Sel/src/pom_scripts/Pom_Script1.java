package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script1 {
	//Declaration
	@FindBy(id="email")
	private WebElement uname;
	
	//Intialization
	public Pom_Script1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void passData()
	{
		uname.sendKeys("selenium");
	}

}
