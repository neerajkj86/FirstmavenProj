package handledropdown;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment4 {



public static void main(String[] args) {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



driver.get("https://www.google.com");



int actualWidth = driver.manage().window().getSize().getWidth();

int actualHeight = driver.manage().window().getSize().getHeight();



System.out.println("Width = " + actualWidth);

System.out.println("Height = " + actualHeight);



for (int width = 100, height = 100; width <= actualWidth && height <= actualHeight; width++, height++) {

driver.manage().window().setSize(new Dimension(width, height));

}



}



}

