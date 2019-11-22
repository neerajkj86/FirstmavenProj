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

public class WikipediaIsdisplayed 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://www.wikipedia.org/");
	
	
	WebElement Block =driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
	
	
	
	List <WebElement> Links= Block.findElements(By.tagName("a"));
	
	System.out.println("Number of Total Links are " +Links.size());
	
	
	List <WebElement> AllLinks= driver.findElements(By.tagName("a"));
	
	System.out.println("Number of Total Links are " + AllLinks.size());
	
	for(WebElement p:AllLinks )
	{
		System.out.println(p.getText()+"----URL is ---" +p.getAttribute("href"));
	}
	
	
	
	}
	
	
	
	
}
