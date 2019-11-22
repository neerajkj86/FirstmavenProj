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

public class EbayDemo1 
{
	WebDriver driver;
	@Test
	public void waytoAutomation() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://in.ebay.com//");
	
	
	
	
	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	
	
	
	List <WebElement> items=driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li"));

	System.out.println("total number of items are "+items.size());
	
	for (WebElement p:items){
		
		String ABC=p.getText();
//		if (p.getText().equalsIgnoreCase("Collectibles")) {
//		
//			p.click();
//			break;
//		}
		
		System.out.println(ABC);
		
		if (ABC.contentEquals("Antiques")) {
			
			p.click();
			break;
			
		}
			
		
				
	}
	
	//	System.out.println("Name of the List element are " +p.getText());
		
//	String innerHTML=p.getAttribute("innerHTML");
//		
//if (innerHTML.contentEquals("Antiques")) {
//	
//	p.click();
//	break;
//	
//	}
//	
//System.out.println("Values are " +innerHTML);
//	}
	
	

	
	

	
	
	}
	
}
	