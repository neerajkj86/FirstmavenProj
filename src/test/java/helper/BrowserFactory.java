package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	public static WebDriver driver;
	public static WebDriver StartBrowser(String BrowserName,String URL)
	{
		if (BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		return driver;
	}

}
