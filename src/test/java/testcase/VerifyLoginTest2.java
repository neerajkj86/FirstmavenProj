package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage2;

public class VerifyLoginTest2 {

	
	WebDriver driver;
	@Test
	public void VerifyLogin() throws Throwable
	{
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://prod-keycloak.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F%3Freturn_to%3Dhttps%253A%252F%252Fwww.utest.com%252F&response_type=code");
		
		LoginPage2 login = new LoginPage2(driver);
		
		login.enterLoginCredentials("j.neeraj2011@gmail.com","Password@12345");
		
		Thread.sleep(3000);
		
	//	String Title = driver.getTitle();
		
		String Title = driver.getPageSource();
		
		//System.out.println("Title of the page is "+Title);
		
		String Expected_Title= "uTest - The Professional Network for testers";
		
		//Assert.assertEquals(Title, Expected_Title, "Login is successfull");
		
		Assert.assertTrue(Title.contains("uTest"));
		
		System.out.println("Title of the page is successfully Verified ");
		
		driver.quit();
	}
	
		

	

}
