package handledropdown;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotLibrary3 {

	//this library is used to give the screenshot name as per the user input not overwriting the same name
	
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		
              Date d = new Date();
		
		//System.out.println(d.toString().replace(":","_").replace(" ", "_")+".jpg");

		String FileName=d.toString().replace(":","_").replace(" ", "_")+".jpg";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src, new File("./Screenshots/"+FileName));
		
		System.out.println("Screenshot Captured");
		
	}
	
}
