package handledropdown;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CleartripCurrency 
{
	
		WebDriver driver;
		@Test
		public void dropdownselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//strong[contains(text(),'Currency')]")).click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Pound Sterling')]")).click();;
		
	

//		Thread.sleep(5000);
//		driver.close();
		}
		
		
		
		
		
}
