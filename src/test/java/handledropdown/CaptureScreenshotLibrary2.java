package handledropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotLibrary2 {

	//this library is used to give the screenshot name as per the user input not overwriting the same name
	
	public static void captureScreenshot(WebDriver driver,String UserInput) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src, new File("./Screenshots/"+UserInput+".png") );
		
		System.out.println("Screenshot Captured");
		
	}
	
}
