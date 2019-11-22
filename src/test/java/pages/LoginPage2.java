package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage2 
{
	WebDriver driver;
	By username=By.id("username");
	
	By password = By.xpath("//input[@id='password']");
	
	By login_button = By.xpath("//button[@id='kc-login']");
	
	
	public LoginPage2(WebDriver driver) //Parameterized constructor as we are passing Web driver as parameters 
	{
		this.driver	 = driver;
	}
	
           public void enterLoginCredentials(String User,String Pass)
           {
        	   
        	   driver.findElement(username).sendKeys(User);
        	   driver.findElement(password).sendKeys(Pass);
        	   driver.findElement(login_button).click();
           
           }
	
           
           
           
              
	}


