package handledropdown;

import java.util.List;
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

public class WikipediaTotalLinks 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("https://www.wikipedia.org/");
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath_to_element")));
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	
	System.out.println(driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]")).isDisplayed());
	driver.close();
	
	}

	public Boolean iselementpresent(String Locator)
	{
		try {
			driver.findElement(By.xpath(Locator));
			return true;
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			return false;
		}
	
		//int size=driver.findElements(By.xpath(Locator)).size();
	}
	

	
	
	}
	
	
	