package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Amazon {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement txtSearch;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickSearch;
	
	
	
	
	public Pom_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void passSearchTxt(String srch)
	{
		txtSearch.sendKeys(srch);
	}
	
	
	public void clickSearch()
	{
		clickSearch.click();
	}


}
