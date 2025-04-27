package com.test.qa.linksandstrings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class find404_500_inPagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	Assert.assertEquals(driver.getPageSource().contains("404") ||driver.getTitle().contains("404"), false);
	driver.quit();
	}

}
