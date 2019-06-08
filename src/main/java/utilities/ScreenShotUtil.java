package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {

	
	public static void captureScreenShot(WebDriver driver, String name, String location) throws IOException {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(location+name+".png"));
		//FileUtils.copyFile(src, new File("c:\\tmp\\screenshot.png"));
		
	}
	
	
}
