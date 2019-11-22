package handledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	// task traverse thru menu: productInfo->Installation->How To Setup click()

	driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
	
	WebElement Image=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
	
	
	//WebElement dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));
	
	
	Actions obj = new Actions(driver);
	
	obj.contextClick(Image).perform();
	
	Thread.sleep(3000);
	
	WebElement ele=driver.findElement(By.xpath("//*[@id='dm2m1i1tdT']"));
	
	obj.moveToElement(ele).perform();
	
	
	//driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a")).click();
	Thread.sleep(3000);
	
	WebElement ElementtoBe=driver.findElement(By.xpath("//*[@id='dm2m2i1tdT']"));
	
	obj.moveToElement(ElementtoBe).perform();
	
WebElement Elementclick=driver.findElement(By.xpath("//*[@id='dm2m3i1tdT']"));
	
Elementclick.click();
	
	
Thread.sleep(3000);

	
	
	driver.close();
	
	
	}
	}	