package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo 
{
	
	WebDriver driver ;
	@Test
	public void Drop() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
		Select obj = new Select(ele);
		List<WebElement> allcountry= obj.getOptions();
		
		System.out.println(allcountry.size());
		
		
		
		
		

}
}