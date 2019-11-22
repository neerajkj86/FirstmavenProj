package pomFactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	
	
	//Create a Constructor with webdriver as an argument
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(id="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID ,using="password") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using ="//button[@id='kc-login']") 
	@CacheLookup
	WebElement Submit;
	
	@FindBy(how=How.LINK_TEXT,using ="Forgot Password?")
	@CacheLookup
	WebElement ForgetPassword;
	
	
	public void login_Utest(String Uid ,String Pass)
	
	{
		
		username.sendKeys(Uid);
		password.sendKeys(Pass);
		Submit.click();
	}
	
	

}
