package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.ToptalHomePage;

public class DeveloperTestWithoutPageFacotry 
{
	
	WebDriver driver;
	public static String PAGE_URL="https://www.toptal.com/talent/apply";
	 @BeforeTest
	   public void setup(){
		 
		 WebDriverManager.chromedriver().setup();
		 
	       driver = new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       driver.get(PAGE_URL);
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,800)");
	   }
	
	@Test
	public void applyAsDeveloper() throws Throwable 
	{
		
			ToptalHomePage applyPage = new ToptalHomePage(driver);
		         
		         //applyPage.SelectRole();
			       //applyPage.SelectRoleasDevloper();
			       applyPage.setDeveloper_email("j.neeraj2011@gmail.com", "jvPnLv6Y3pr86vp", "jvPnLv6Y3pr86vp", "Neeraj");
			       //applyPage.TermsnConditions();
			       //applyPage.clickOnJoin();
			       
	}
			       @AfterTest
			       public void close()
			       {
			             driver.close();
			          }       
			       
	}

	

