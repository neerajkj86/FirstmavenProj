package handledropdown;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment4_1 {



public static void main(String[] args) {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.google.com");

System.out.println(driver.manage().window().getSize());

int actualheight=driver.manage().window().getSize().getHeight();

int actualwidth = driver.manage().window().getSize().getWidth();

System.out.println("Width = " + actualwidth);

System.out.println("Height = " + actualheight);

for(int width=100,height=100;width<=actualwidth && height<=actualheight;width++,height++) {
	
	Dimension d = new Dimension (width,height);
	
	driver.manage().window().setSize(d);
	
}

}



}





