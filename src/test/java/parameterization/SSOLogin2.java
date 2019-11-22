package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sample.firstmavenproject.ExcelUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSOLogin2 {

	
	WebDriver driver;
	 
	@Test(dataProvider="Neeraj")
	public void SSOData(String userName,String password) throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://ssotst.xchanging.com/portal/UI/Login");
		
		driver.findElement(By.xpath("//*[@id='IDToken1']")).sendKeys(userName);
		
		driver.findElement(By.xpath("//*[@id='IDToken2']")).sendKeys(password);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[6]/table/tbody/tr/td/table/tbody/tr[6]/td/div/input")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home Page"),"user is not able to login successfully-Invalid credenitals");
		
		
		System.out.println("Data read successfully-Page Title Verfied ");

	}
	
	@AfterMethod
		public void teardown()
		{
		driver.close();
		
		
		
	}
	
	
	
	
	@DataProvider(name="Neeraj")
	public Object[][] getdata() throws Throwable
	{
		String excelpath = "C:\\Users\\jainne\\Documents\\Acord Test Execution\\Write.xlsx";
		ExcelUtils config = new ExcelUtils(excelpath, "sheet1");
		
		int rowCount = config.getRowCount();
			
			//int colCount = config.getColCount();
			
			Object data[][]=new Object[rowCount][2];
			
			for (int i=0;i<rowCount;i++)
			{
				
				data[i][0]= ExcelUtils.getCellData(i, 0);
				
				data[i][1]= ExcelUtils.getCellData(i, 1);
				
				
			}
			return data;
		
		
			
	}

}
