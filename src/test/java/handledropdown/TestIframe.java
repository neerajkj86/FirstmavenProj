package handledropdown;
 
import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestIframe {
 
	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("There are " + frames.size() + "frames in the page");
		int i = 0;
		for (i = 0; i < frames.size(); i++) {
			if (frames.get(i).getAttribute("id").isEmpty()) {
				driver.switchTo().frame(i);
				System.out.println("frame#" + i + " has no id");
				driver.switchTo().defaultContent();
 
			} else {
				System.out.println(i + "frame's id = " + frames.get(i).getAttribute("id"));
			}
 
		}
	}
 
}