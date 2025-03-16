package com.test.qa;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class handling_alerts {

	//public static void main(String args[]) {
	WebDriver driver;	
		@BeforeTest()
		public void Open_Browser() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadTimeout(Duration.ofSeconds(5));
		
		driver = new EdgeDriver(options);

		
		}
		
		@Test(priority = 1)//Priority =1;
		
		public void Handling_SimpleAlert() {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement simplealert = driver.findElement(By.xpath("//button[@id=\"alertBtn\"]"));
		
		simplealert.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("Handling_SimpleAlert---Executed");
		
		}
		
		
		@Test()
		public void Handling_SimpleAlert_withEplicitWait() {
			
			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement simplealert = driver.findElement(By.xpath("//button[@id=\"alertBtn\"]"));
			
			simplealert.click();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Alert alert = MyWait.until(ExpectedConditions.alertIsPresent());
			
			
			//Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Handling_SimpleAlert_withEplicitWait---Executed");

		
		}
		
		@Test()
		public void Handling_SimpleAlert_WithJSExecutor() {
			
			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement simplealert = driver.findElement(By.xpath("//button[@id=\"alertBtn\"]"));
			
			simplealert.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			

			JavascriptExecutor jse = (JavascriptExecutor)driver;
			try {
			jse.executeScript("window.alert=function{}");
			
			}catch(Exception e) {
				
			}

			System.out.println("Handling_SimpleAlert_WithJSExecutor---Executed");

		}
		
		@Test()//Priority =1;
		
		public void Handling_SimpleAlert_basicSwitch() {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement simplealert = driver.findElement(By.xpath("//button[@id=\"alertBtn\"]"));
		
		simplealert.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.switchTo().alert().accept();
	//	driver.accept();
		
		System.out.println("Handling_SimpleAlert-with basic switch--Executed");
		
		}
		
		
		@AfterTest()
		public void Close_browser(){
		driver.quit();
		}
		
	}

