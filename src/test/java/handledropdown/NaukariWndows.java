package handledropdown;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukariWndows 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	

	driver.get("https://www.naukri.com/");
	
String Parent=driver.getWindowHandle();
	
System.out.println("Naukari Window id is"+Parent );


Set <String> allwindows=driver.getWindowHandles();

int countofwindows= allwindows.size();

System.out.println("Total windows are " +countofwindows);
		
	for (String child:allwindows)
	{
		if (!Parent.equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			System.out.println("Child Window Title is "+driver.getTitle());
			driver.close();
		}
		
		
	}
	
	driver.switchTo().window(Parent);
	
	System.out.println("Parent Window Title is " +driver.getTitle());
	
	driver.close();
	
	
	
	
	
	
	
	
	
	//driver.close();
	
	
	}
	}	