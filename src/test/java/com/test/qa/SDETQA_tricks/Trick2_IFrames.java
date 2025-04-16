package com.test.qa.SDETQA_tricks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Trick2_IFrames {


		@Test
		public void iframehandling_Usingswitchto() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Iframe
		
		WebElement frame1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		System.out.println("Switched to Iframe");
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//.pollingEvery(Duration.ofSeconds(2));
		//mywait.until(ExpectedConditions.elementToBeSelected(frame1));
		
		WebElement textbox = driver.findElement(By.cssSelector("input[name ='mytext1']"));
		mywait.until(ExpectedConditions.visibilityOf(textbox));
		System.out.println("identify textbox in iframe element");

		textbox.sendKeys("Hi");
		System.out.println("Enter hi in textbox of iframe element");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

		
		@Test
	public void IframeHandling_Usingexplicitwait() {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			// Iframe
			
			WebElement frame1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
			WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
			
			System.out.println("Test2 Switched to Iframe");
			FluentWait<WebDriver> fluentwait = new WebDriverWait(driver, Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
			//mywait.until(ExpectedConditions.elementToBeSelected(frame1));
			
			WebElement textbox = driver.findElement(By.cssSelector("input[name ='mytext1']"));
			fluentwait.until(ExpectedConditions.visibilityOf(textbox));
			System.out.println("Test2 identify textbox in iframe element");

			textbox.sendKeys("Hi");
			System.out.println("Test2 Enter hi in textbox of iframe element");

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.quit();
			
					
			
		}
		
		
}
