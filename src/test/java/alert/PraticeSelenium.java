package alert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeSelenium {

	
	public static void main(String[] args) {
		
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("alert('hello world');");

		System.currentTimeMillis();
	}
	

}
