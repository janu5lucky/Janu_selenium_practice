package com.test.qa.SDETQA_tricks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Trick7_pageScrolling {


		@Test(enabled=false)
		public void pagescrollingusing_JSE() throws Exception {
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		List<WebElement> newbooks = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		ArrayList<String> booktitles = new ArrayList<String>();
		for (WebElement newbook : newbooks ) {
			
			booktitles.add(newbook.getText());
			
			
		}
		
		
		
		System.out.println("no.of new books : "+booktitles.size());
		System.out.println("no.of new books : "+booktitles);

		driver.quit();
		
		
		
	}

		
		@Test
		public void Pagescrolling_using_loop() throws Exception {
		
			
			WebDriver  driver = new FirefoxDriver();
			driver.get("https://www.booksbykilo.in/new-books");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			int currentcount= 0;
			int previouscount = 0;
			
			while(true) {
				List<WebElement> newbooks = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
				currentcount = newbooks.size();
				
				if(currentcount == previouscount) {
					
					break;
				}
				previouscount=currentcount;
				jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				Thread.sleep(3000);
			}
			System.out.println("total book count :"+currentcount);
			driver.quit();
		}
}
