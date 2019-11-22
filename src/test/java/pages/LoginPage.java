package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage 
{
	WebDriver driver;
	
	By username=By.id("username");
	
	By password = By.xpath("//input[@id='password']");
	
	By login_button = By.xpath("//button[@id='kc-login']");
	
	
	public LoginPage(WebDriver driver) //Parameterized constructor as we are passing Web driver as parameters 
	{
		this.driver	 = driver;
	}
	
           public void enterUsername(String User)
           {
        	   
        	   driver.findElement(username).sendKeys(User);
           }
	
           
           public void enterPassword(String Pass)
           {
        	   driver.findElement(password).sendKeys(Pass);
           }
           
           public void clickonSubmitButton()
           
           {
        	   driver.findElement(login_button).click();
           }
	}


