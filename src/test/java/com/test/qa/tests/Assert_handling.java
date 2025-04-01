package com.test.qa.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_handling {
	
	WebDriver driver;
	
	@BeforeTest()
	public void OpenBrowser() {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setPageLoadTimeout(Duration.ofSeconds(10));
		
		driver = new ChromeDriver(options);
		
	}
	
	
	@Test
	public void Handling_Assertions_hard() {
		
		
		String URL = "https://www.google.com/";
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//WebElement googletextbox = driver.findElement(By.xpath ("//div/textarea[@class=\"gLFyf\"]"));
	//	googletextbox.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		//googletextbox.sendKeys("selenium webdriver", Keys.ARROW_DOWN, Keys.ENTER);
		//try {
		//	Thread.sleep(3000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
//		}
		
		//List <WebElement> searchresults = driver.findElements(By.xpath ("//li[@role=\"presentation\"]"));
	//	for(int i=1;i>=searchresults.size();i++) {
		//	if(searchresults[i]  "selenium webdriver") {
				
			//}
	//	}
		
		String expectedTitle = driver.getTitle();
		//   //div/span[contains(text(),"selenium webdriver")]
		// //div/span[text()="selenium webdriver"]
		
		/// //div/li[@role="presentation"][1]
		String ActualTitle = "Google";
		
		assertEquals(ActualTitle,expectedTitle,"This matches");
		if((true)) {
			
			System.out.println("This Match");
		}else {
		//	//ScreenShot ss = new ScreenShot();
			System.out.println("This Match");

	}
	
		
	}	
	
	
	@Test
	public void Handling_Assertions_soft() {
		
		
		String URL = "https://www.google.com/";
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//WebElement googletextbox = driver.findElement(By.xpath ("//div/textarea[@class=\"gLFyf\"]"));
	//	googletextbox.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SoftAssert softassert = new SoftAssert();
		String expectedTitle = driver.getTitle();
		//   //div/span[contains(text(),"selenium webdriver")]
		// //div/span[text()="selenium webdriver"]
		
		/// //div/li[@role="presentation"][1]
		String ActualTitle = "Google";
		
		softassert.assertEquals(ActualTitle,expectedTitle,"This matches");
		
				
		softassert.assertAll();
	}

	
	@AfterTest
	
	public void Close_Browser() {
	

		driver.quit();

		}	
	
	
}
