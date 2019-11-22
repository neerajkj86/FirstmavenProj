package property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperty {
 
	public static void main(String[] args) throws Throwable {
		
		PropertyReading obj = new PropertyReading();
		
		//System.out.println(obj.GetURL());
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(obj.GetURL());
		
		
		

	}

}
