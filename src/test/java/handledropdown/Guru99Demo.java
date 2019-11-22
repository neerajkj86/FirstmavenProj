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

public class Guru99Demo 
{
	WebDriver driver;
	@Test
	public void waytoAutomation() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	
	driver.get("https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html");
	
	//WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath_to_element")));
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	
	driver.findElement(By.xpath("//span[text()='Testing']")).click();
	
	
	List <WebElement> items=driver.findElements(By.xpath("//*[@id=\"g-mobilemenu-container\"]/ul/li[2]/ul/li/div/div[1]/ul/li[8]/a/span/span"));
	
	System.out.println("Total number of items are"+items.size());
	
	driver.close();
	
	
	}

	
	

	
	
	}
	
	
	