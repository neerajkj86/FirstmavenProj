package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots 
{
	
	public static void takescreenshot()
	{
		
		Date d  = new Date();
		
		String FileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(Src, new File("./Screenshots/"+FileName));
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();

	 driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		takescreenshot();
		
		driver.findElement(By.name("q")).sendKeys("Testing");
		takescreenshot();
		
	
	driver.quit();
		
		
		
		
	}

}
