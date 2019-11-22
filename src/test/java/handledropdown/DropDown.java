package handledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
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

	driver.get("https://www.toptal.com/talent/apply");
	
	
	WebElement abc= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[1]")));
	
		abc.click();	
			
	//driver.findElement(By.xpath("//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[1]")).click();
	
	wait.until(ExpectedConditions.visibilityOf(abc));
	driver.findElement(By.xpath("//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[2]/div[2]/div[1]/div[1]")).click();
	
	//Wait wait = new FluentWait<WebDriver>(driver) //Fluent Wait with polling interval
		//	.withTimeout(30, TimeUnit.SECONDS)
			//.pollingEvery(10,TimeUnit.SECONDS)
			//.ignoring(NoSuchElementException.class);
	
	//wait.until(ExpectedCondition<T>)
	
	
	driver.close();
	
	}
}
