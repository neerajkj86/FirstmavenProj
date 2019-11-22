package handledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterActionClass 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);

	driver.get("https://www.gmail.com");
	
	driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("engneeraj.jain");
	
	driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);
	
	//alternate ways to click enter by using actions class
		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.sendKeys(Keys.ENTER).perform();
		 */
	

	
	
	
	
	
	
	}
	}	