package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

//without page facotry
public class ToptalHomePage 
{
	WebDriver driver;
	
	By Role = By.xpath("//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[1]");
	
	By Role_Selection = By.xpath("//*[@id=\"new_talent_create_applicant\"]/section/div/div[1]/fieldset/div[2]/div[2]/div[4]/div[1]");
	
	By developer_email = By.id("talent_create_applicant_email");
	
	By Password= By.id ("talent_create_applicant_password");
	
	By confirm_Password= By.id("talent_create_applicant_password_confirmation");
	
	By Name = By.id("talent_create_applicant_full_name");
	
	By CheckBox= By.className("label_wrap");
	
     By Join=By.id("save_new_talent_create_applicant");
	

	public ToptalHomePage(WebDriver driver) //Parameterized constructor as we are passing Web driver as parameters 
	{
		this.driver	 = driver;
	}
	
	public void setDeveloper_email(String email,String Pass,String ConfirmPass,String fullname ) throws Throwable
	{
		driver.findElement(Role).click();
		Thread.sleep(5000);
		driver.findElement(Role_Selection).click();
		Thread.sleep(5000);
		driver.findElement(developer_email).sendKeys(email);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(confirm_Password).sendKeys(ConfirmPass);
		driver.findElement(Name).sendKeys(fullname);
		driver.findElement(CheckBox).click();
		driver.findElement(Join).click();
		
		
		
	}       
	
           
           
           
              
	}


