package handledropdown;

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

public class RediffAlert 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
	
	driver.findElement(By.name("proceed")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));
	
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	
	System.out.println(alert.getText());
	
	alert.accept();
	
//	Actions obj = new Actions(driver);
//	
//	obj.moveToElement(dropdown).perform();
//	
//	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a")).click();
	
	//driver.close();
	
	
	}
	}	