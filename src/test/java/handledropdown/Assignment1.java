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

public class Assignment1 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("https://www.google.com/");
	
	//WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath_to_element")));
	//wait.until(ExpectedConditions.elementToBeClickable(element));
	
	driver.findElement(By.name("q")).sendKeys("WaytoAutomation");
	
	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
	
	driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")).click();
	
	List <WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("Links counts will be " +links.size());
	
	for (WebElement link: links ) {
		
	System.out.println(link.getText() );
		
	}
	
	
	driver.close();
	
	
	}

	
	

	
	
	}
	
	
	