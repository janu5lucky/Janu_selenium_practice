package com.test.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;


public class handling_Iframes {
	WebDriver driver;
	
	@Parameters ("browserName")
	@BeforeTest()
	public void initializebrowser(String browserName) {
		
		switch (browserName.toLowerCase())
		{
			case "chrome" : 
				ChromeOptions chromeoptions = new ChromeOptions();
				chromeoptions.addArguments("--start-maximized");
				chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new ChromeDriver(chromeoptions);
				break;
				
			case "edge" : 
				EdgeOptions edgeoptions = new EdgeOptions();
				edgeoptions.addArguments("--start-maximized");
				edgeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new EdgeDriver(edgeoptions);
				break;	
				
				default:
					break;
					
				
		}
	}
		
		@Parameters("url")
		@Description ("verifying Handling Iframe using Switchto()")
		@Test
		public void handling_Iframe_with_SwitchTo(String url) {
			driver.get(url);
			driver.switchTo().frame(0);
			WebElement textbox = driver.findElement(By.name("mytext1"));
			textbox.sendKeys("Hi");
			System.out.println("handling_Iframe_with_SwitchTo--- run successfully");
			
		}
		@Parameters("url")
		@Description ("verifying Handling Iframe without using Switchto()")
		@Test
		public void handling_Iframe_without_SwitchTo(String url) {
			driver.get(url);
			driver.switchTo().frame(0);
			WebElement textbox = driver.findElement(By.name("mytext1"));
			textbox.sendKeys("Hi");
			System.out.println("handling_Iframe_without_SwitchTo--- run successfully");
			
			
		}
		
		
		
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}
	}
	

