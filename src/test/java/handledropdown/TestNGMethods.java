package handledropdown;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGMethods {

	@BeforeClass
	public void warmup()
	{
		System.out.println("In the BeforeClass");
	}
	
	 @BeforeMethod
	 public void startBrowser(){
	 	System.out.println("Start your browser");
	 }
	
	@BeforeTest
	public void CreateDBconn()
	{
		System.out.println("Creating db connection");
	}
	
	@AfterTest
	public void CloseDBconn()
	{
		System.out.println("Closing db connection");
	}
	
	

	
@Test (priority=1)
@Parameters("Browser")
public void dologin() {
	System.out.println("DO your login");
}

@Test(priority=2)
public void userRegistration()
{
	System.out.println("Do the user Regisration");
}
@Test(priority=3)
public void accountopen()
{
	System.out.println("Open the account");
	
	SoftAssert softassert = new SoftAssert();
	
	//softassert.assertEquals(actual, expected);
}

@AfterMethod
public void QuitBrowser(){
	System.out.println("Close your browser");
}

@AfterClass
public void Exhaust()
{
	System.out.println("After Class");

}

}


//@BeforeSuite: The annotated method will be run before all tests in this suite have run. 
//@AfterSuite: The annotated method will be run after all tests in this suite have run. 
//@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run. 
//@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run. 
//@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked. 
//@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked. 
//@BeforeClass: The annotated method will be run before the first test method in the current class is invoked. 
//@AfterClass: The annotated method will be run after all the test methods in the current class have been run. 
//@BeforeMethod: The annotated method will be run before each test method. 
//@AfterMethod: The annotated method will be run after each test method.