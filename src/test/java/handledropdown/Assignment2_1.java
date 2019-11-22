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

public class Assignment2_1 
{
	WebDriver driver;
	@Test
	public void waytoAutomation() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("http://way2automation.com/way2auto_jquery/index.php");
	
	//WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath_to_element")));
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	
	driver.findElement(By.name("name")).sendKeys("Neeraj");
	
	driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']/div/div/input[@value='Submit']")).click();
	
	////fieldset/following-sibling::fieldset/following-sibling::fieldset/following-sibling::div/div/following-sibling::div/input
	Thread.sleep(3000);
	
	driver.close();
	
	
	}

	
	

	
	
	}
	
	
	