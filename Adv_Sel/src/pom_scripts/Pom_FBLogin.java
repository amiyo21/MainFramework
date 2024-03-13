package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_FBLogin {
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	
	
	
	public Pom_FBLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void passUname(String un)
	{
		uname.sendKeys(un);
	}
	
	public void passPwd(String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void clickLogin()
	{
		login.click();
	}

}
