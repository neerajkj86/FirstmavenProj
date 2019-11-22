package handledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown 
{
	
		WebDriver driver;
		@Test
		public void dropdownselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[1][text()='HTML']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		}
}
