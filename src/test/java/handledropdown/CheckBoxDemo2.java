package handledropdown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo2 
{
	
		WebDriver driver;
		@Test
		public void checkboxselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/radio.html");
	
		
		List<WebElement> checkboxes=	driver.findElements(By.name("webform"));
		//driver.findElement(By.xpath("//*[@id='vfb-6-0']")).click();
		//driver.findElement(By.xpath("//*[@id='vfb-6-1']")).click();
		//driver.findElement(By.xpath("//*[@id='vfb-6-2']")).click();
		
		System.out.println("Number of elements are "+checkboxes.size());
		
		for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}
		
		Thread.sleep(5000);
		driver.close();
	
		
		
	
}

}