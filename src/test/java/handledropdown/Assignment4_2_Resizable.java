package handledropdown;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment4_2_Resizable {



public static void main(String[] args) {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


for(int x=400; x <= 1200; x++) {
	Dimension d = new Dimension(x, x);
	driver.manage().window().setSize(d);
}


}



}

