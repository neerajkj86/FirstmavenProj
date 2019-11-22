package www.toptal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage 
{
	
	@FindBy(tagName="h1")
	
	WebElement heading;
	
	@FindBy(name="commit")
	@CacheLookup
	WebElement JoinButton;

	WebDriver driver;
	public DeveloperPortalPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this); //To Initilise the webelement
	}
	
	
	//We will use this boolean for assertion. To check if page is opened
	
	public boolean isPageopened()
	{
		return heading.getText().toString().contains("Apply to Join");
		
		
	}
	
	public void Click_JoinButton() 
	{
		JoinButton.click();
	}
	
}
