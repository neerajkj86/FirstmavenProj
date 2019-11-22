package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import www.toptal.pages.ApplyFreelancersPage;
import www.toptal.pages.DeveloperPortalPage;
import www.toptal.pages.HomePage;

public class ApplyAsDeveloperTest 
{
	
	WebDriver driver;
	public static String PAGE_URL="https://www.toptal.com";
	 @BeforeTest
	   public void setup(){
		 
		 WebDriverManager.chromedriver().setup();
		 
	       driver = new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       driver.get(PAGE_URL);
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	   }
	
	@Test
	public void applyAsDeveloper() throws InterruptedException 
	{
		HomePage home = new HomePage(driver);
				home.clickon_Devloper_button();
		
				//Create object of DeveloperPortalPage
			       DeveloperPortalPage devportal= new DeveloperPortalPage(driver);
			       
			      // Assert.assertTrue(devportal.isPageopened());  
			       
			       ApplyFreelancersPage applyPage =new ApplyFreelancersPage(driver);
			       
			       applyPage.SelectRole();
			       applyPage.SelectRoleasDevloper();
			       applyPage.setDeveloper_email("j.neeraj2011@gmail.com", "jvPnLv6Y3pr86vp", "jvPnLv6Y3pr86vp", "Neeraj");
			       applyPage.TermsnConditions();
			       applyPage.clickOnJoin();
			       
	}
			       @AfterTest
			       public void close()
			       {
			             driver.close();
			          }       
			       
	}

	

