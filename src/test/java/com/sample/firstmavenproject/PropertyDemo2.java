package com.sample.firstmavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//in framework we write all the logic of Property file initlization in the test base class.
public class PropertyDemo2 
{
	
	WebDriver driver;
	@Test
	public void testChrome() throws IOException
	
	{
		
		//System.getProperty("user.dir");
		//in java properties is a class so we need to create an object of properties file.
		
File Src = new File ("./Configurations/config.property");
		
		FileInputStream fis = new FileInputStream(Src);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String ChromePath=prop.getProperty("ChromeDriver");
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		
		
		
		
		
	}

}
