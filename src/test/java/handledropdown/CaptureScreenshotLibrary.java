package handledropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotLibrary {

	
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src, new File("./Screenshots/google.png") );
		
		System.out.println("Screenshot Captured");
		
	}
	
}
