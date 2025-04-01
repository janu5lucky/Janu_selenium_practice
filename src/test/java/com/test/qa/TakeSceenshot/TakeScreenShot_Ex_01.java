package com.test.qa.TakeSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_Ex_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);

		/// myscreenShot;
		File Screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshotfile,
		new File(
		"D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ScreenShots\\screenshot_2.png"));
	Thread.sleep(3000);
	driver.quit();
	
	}

}
