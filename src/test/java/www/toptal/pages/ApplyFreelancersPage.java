package www.toptal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplyFreelancersPage 
{
	@FindBy(xpath= "//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[1]")
	
	WebElement Devloper;

	
	@FindBy(xpath="//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[2]/div[1]/div[1]")
	
	WebElement Devloper_selection;
	
	@FindBy(id= "talent_create_applicant_email")
	@CacheLookup
	WebElement developer_email;
	
	@FindBy(id= "talent_create_applicant_password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(id= "talent_create_applicant_password_confirmation")
	@CacheLookup
	WebElement confirm_Password;
	
	@FindBy(id= "talent_create_applicant_full_name")
	@CacheLookup
	WebElement Name;
	
	@FindBy(className= "label_wrap")
	@CacheLookup
	WebElement CheckBox;
	
	@FindBy(id= "save_new_talent_create_applicant")
	@CacheLookup
	WebElement Join;
	
	
	
	WebDriver driver;
	
	public ApplyFreelancersPage(WebDriver driver)
	{
		this.driver= driver;
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SelectRole() throws InterruptedException
	{
		Devloper.click();
		Thread.sleep(3000);
	}
	
	public void SelectRoleasDevloper()  throws InterruptedException
	{
		Devloper_selection.click();
		Thread.sleep(3000);
	}
	
	public void setDeveloper_email(String email,String Pass,String ConfirmPass,String fullname )
	{
		developer_email.clear();
		developer_email.sendKeys(email);
		Password.clear();
		Password.sendKeys(Pass);
		confirm_Password.clear();
		confirm_Password.sendKeys(ConfirmPass);
		Name.clear();
		Name.sendKeys(Pass);
		
	}
	
	public void TermsnConditions()
	{
		CheckBox.click();
	}
		
		
		public void clickOnJoin(){
		       Join.click();
		   }		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

