package utiity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Configreader 
{
	
	Properties prop;
	public Configreader()
	{
	
	File Src = new File ("./Configurations/config.property");
	
	try {
		FileInputStream fis = new FileInputStream(Src);
	prop = new Properties();
		
		prop.load(fis);
		//String ChromePath=prop.getProperty("ChromeDriver");

	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	
	}
	
	
	public String getChromePath()
	{
		String Path=prop.getProperty("ChromeDriver");
		return Path;
			
	}
	
	public String getURL()
	{
		
		String URL = prop.getProperty("URL");
		return URL;
		
	}
	
}
