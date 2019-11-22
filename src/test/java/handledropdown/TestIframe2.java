package handledropdown;
 
import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestIframe2 {
	
	public static WebDriver driver;
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
 
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(WebElement frame: frames) {
			System.out.println(frame.getAttribute("id"));
		}
		
		//driver.switchTo().frame("iframeResult");
		//Assignment  switch to the frame without using the id or Name.  so, without this; driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		
	}
	}
 