package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks 
{
	
		WebDriver driver;
		
		
		@BeforeTest
		public void setup()
		{
			
			 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			//Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			
			driver.get("https://www.google.com/");
			
			
		
		}
		
		@Test
		public void dropdownselect() throws Exception
		{
	//	WebDriverManager.chromedriver().setup();
		//WebDriverManager.iedriver().setup();
			//WebDriverManager.firefoxdriver().setup();
		
		
	List <WebElement> total_links=driver.findElements(By.tagName("a"));
	
	
		
	System.out.println("Total number of links are "+total_links.size());
for(WebElement element:total_links )
	{
		
	String Linktext = element.getText();
	
	//String Linktext = element.getAttribute("innerHTML");
	
	System.out.println("Links are "+Linktext + "----URL is---"+element.getAttribute("href"));
	
	}
		
		
		Thread.sleep(5000);
		driver.close();
		}
}
