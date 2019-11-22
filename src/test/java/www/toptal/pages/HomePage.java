package www.toptal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	
	//Apply as Devloper buttton
	//@FindBy(linkText="Apply as a Freelancer")
	//WebElement Apply_Button;
	
	@FindBy(how = How.LINK_TEXT, using = "APPLY AS A FREELANCER")
	WebElement Apply_Button;
	//Constructor
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickon_Devloper_button()
	{
		Apply_Button.click();
	}
	

}
