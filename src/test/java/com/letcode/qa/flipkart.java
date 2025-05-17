package com.letcode.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkart {
WebDriver driver;

	@BeforeTest
	public void launchbrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
@Test
public void searchiphoneamdgetprice() {
	
	WebElement searchbox = driver.findElement(By.cssSelector("input.Pke_EE"));
	WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
	ewait.until(ExpectedConditions.visibilityOf(searchbox));
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;background:yellow')",  searchbox);
	
	
	
}

@AfterClass
public void closebrowser() {
	
	driver.quit();
}

}
