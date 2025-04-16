package com.test.qa.SDETQA_tricks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trick1_alerts {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String mainwindow = driver.getWindowHandle();
		driver.manage().window().maximize();
		
		WebElement singlealert = driver.findElement(By.xpath("//button[@id=\"alertBtn\"]"));
		singlealert.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("alert handled approach1 done---------");
		

		// Approach2 
		//WebElement simplealert = driver.findElement(By.cssSelector("button#alertbtn"));
		//simplealert.click();
		singlealert.click();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(3000);

		System.out.println("alert handled approach2 done---------");

		
		// Approach 3
		Thread.sleep(3000);

		singlealert.click();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		try {
		jse.executeScript("window.alert=function{};");
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
		System.out.println("alert handled approach3 done---------");

		driver.quit();
		
		
	}

}
