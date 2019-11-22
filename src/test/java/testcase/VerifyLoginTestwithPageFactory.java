package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pomFactorypages.LoginPage;

public class VerifyLoginTestwithPageFactory 
{
	
	@Test
	public void VerifyLogins()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//driver//chromedriver75//chromedriver.exe");
		
	WebDriver driver = BrowserFactory.StartBrowser("Chrome", "https://prod-keycloak.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F%3Freturn_to%3Dhttps%253A%252F%252Fwww.utest.com%252F&response_type=code");
	
	//Web page classes or Page Objects containing web elements need to be initialized 
	//using Page Factory before the web element variables can be used. 
	//This can be done simply through the use of initElements function on PageFactory:
	
	
	//LoginPage Login_Page=PageFactory.initElements(driver, LoginPage.class);
	
	LoginPage Page = new LoginPage(driver);
	
	PageFactory.initElements(driver, Page);
	
	
	Page.login_Utest("j.neeraj2011@gmail.com", "Password@12345");
	
	System.out.println("Test Complete");
	
	driver.quit();
	
	}
}
