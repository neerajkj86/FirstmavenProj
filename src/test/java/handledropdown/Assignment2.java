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

public class Assignment2 
{
	WebDriver driver;
	@Test
	public void waytoAutomation() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver(); //default constructor  where chromedriver is a class and webdriver is an interface and we are using run time polymorphism with upcasting
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("http://way2automation.com/way2auto_jquery/index.php");
	
	//WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath_to_element")));
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	
	driver.findElement(By.name("name")).sendKeys("Neeraj");
	
	driver.findElement(By.xpath("//fieldset/following-sibling::fieldset/following-sibling::fieldset/following-sibling::div/div/following-sibling::div/input")).click();
	
	////fieldset/following-sibling::fieldset/following-sibling::fieldset/following-sibling::div/div/following-sibling::div/input
	Thread.sleep(3000);
	
	//following-sibling::fieldset/following-sibling::
	
	driver.close();
	
	
	}

	
	

	
	
	}
	
	
	