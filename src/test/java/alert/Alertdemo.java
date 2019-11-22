package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo {

	
	WebDriver driver;
	@Test(groups= "Neeraj")
	public void AlertBox() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The test inside the alert box is "+alert.getText());
		
	
		driver.close();
		
		
		
		
	}

}
