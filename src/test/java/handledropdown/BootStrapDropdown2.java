package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown2 
{
	
		WebDriver driver;
		@Test
		public void dropdownselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
	List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[@role='listbox']/Li/descendant::div[3]/span"));
		
	
for(WebElement element:dd_menu )
	{
		String text1=element.getText();
		
		if (text1.equalsIgnoreCase("testing techniques"))
		{
			element.click();
			break;
		}
	}
		
		
		Thread.sleep(5000);
		driver.close();
		}
}
