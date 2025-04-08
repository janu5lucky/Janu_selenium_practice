package com.test.qa.Browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomin_zoomout_Ex_002 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.transform = 'scale(0.5)';");
		Thread.sleep(2000);

		jse.executeScript("document.body.style.transform = 'scale(1.5)';");

		Thread.sleep(2000);
		
		driver.quit();
	}

}
