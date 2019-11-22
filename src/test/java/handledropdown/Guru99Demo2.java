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

public class Guru99Demo2 
{
	WebDriver driver;
	@Test
	public void waytoAutomation() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	
	driver.get("https://www.guru99.com/");
	
	
	
	
	driver.findElement(By.xpath("//div/div[1]/div/UL[1][@class='menu'][@id='java_technologies']/li[1]/a[text()='Software Testing']")).click();
	
	driver.findElement(By.xpath("//Span[text()='Home']")).click();

	
	
	
	}
	

	
	

	
	
	}
	
	
	