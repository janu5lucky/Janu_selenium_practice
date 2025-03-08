package com.test.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class automate_google_languagebar {
	
	WebDriver driver;
	
	@BeforeTest
	public void Open_browser(){
	
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");

		driver = new ChromeDriver(options);
		
	}
	
	    @Description("Verify Web Tables")

		@Test
		public void Handle_google_languageBar() {
			
			String URL = "https://Google.com";
			driver.get(URL);
			WebElement languagebar = driver.findElement(By.xpath("//div[@id=\"SIvCob\"]"));
			String data = languagebar.getText();
			System.out.println(data);
			
			WebElement fortelugu = driver.findElement(By.xpath("//a[contains(text(),'తెలుగు')]"));
					fortelugu.click();
					// hl=te&amp
					///   //a[contains(text(),'తెలుగు')]"));
					//  //div[@id="SIvCob"]/a[contains(text(),"te&amp")]
		}
	    
	    
	    @AfterTest
		
		public void Close_Browser() {
		
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.quit();

			}	
		
		
	}
	

