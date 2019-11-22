package handledropdown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDynamic 
{
	
		WebDriver driver;
		@Test
		public void checkboxselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
	List <WebElement> rowNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	
	List <WebElement> colNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
	
	System.out.println("Total number of rows are ::::"+rowNum.size());
	
	System.out.println("Total number of Columns are ::::"+colNum.size());
	
	for (int i=1;i<=rowNum.size();i++){
		for(int j=1;j<=colNum.size();j++){
		
		System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
		}
		
		System.out.println();
	}
		
				
				//for total number of column = //table[@class='dataTable']/tbody/tr[1]/td
				
				//for total numbr of rows = //table[@class='dataTable']/tbody/tr
	
				
		
		
		
		Thread.sleep(5000);
		driver.close();
	
		
		
	
}

}