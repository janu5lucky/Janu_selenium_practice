package com.test.qa.TakeSceenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String Screeshotname) throws Exception {
		File Screenshort = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshort,
		new File("./ScreenShots/"+Screeshotname+".png"));
		
		
	}

}
