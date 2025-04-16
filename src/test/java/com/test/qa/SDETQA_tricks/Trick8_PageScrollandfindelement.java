package com.test.qa.SDETQA_tricks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Trick8_PageScrollandfindelement {

	
	@Test
	public void verify_element_scrollingdata() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement books = driver.findElement(By.xpath("//h3[normalize-space()=\"My Perfect Dolls House\"]"));
		//WebElement book = driver.findElement(By.xpath("//h3[normalize-space()=\"There's Always One!\"]"));
		//System.out.println(book.getText());
		// Read At Home Super Dad
		//Actions act = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].scrollIntoView();", book);
		
		
		//act.scrollToElement(book).click().build().perform();
		
		
		boolean found = false;
		
		while(!found) {
			
		List<WebElement> newbooks = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));

		for (WebElement book :newbooks) {
			
			if(book.getText().equals("Read At Home Super Dad")) {
				
				System.out.println("Found Book");
				found = true;
				break;
			}
			
		}
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}
		try {
			
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
		
		driver.quit();
		
		}
		
	}
	@Test
	public void verify_element_scrollingdata01() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		
		boolean found = false;
		
		while(!found) {
			
		List<WebElement> newbooks = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));

		for (WebElement book :newbooks) {
			
			if(book.getText().equals("Read At Home Super Dad")) {
				
				System.out.println("Found Book");
				found = true;
				break;
			}
			
		}
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
		try {
			
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
		
		driver.quit();
		
		}
		
	}
	
}
