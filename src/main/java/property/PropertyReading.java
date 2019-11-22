package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReading 
{
	
	Properties prop ;
	File src;
	FileInputStream fis;
	public PropertyReading() throws Throwable
	{
		
		prop = new Properties();
		
		src = new File("./Configurations/config.property");
		
		fis = new FileInputStream(src);
		prop.load(fis);
		
		
	
	}
	
	
	public String GetURL()
	{
		
		String URL=prop.getProperty("URL");
	
return URL;	
	}
	
	

}
