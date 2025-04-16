package com.test.qa.pagenation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class canvaportal_pagenavigation {

	public static WebDriver driver;

	@BeforeTest
	public void browserOpen() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);

	}

	@Test
	public static void testcanva() throws Exception {
		String url = "https://www.canva.com/";

		driver.get(url);
		List<WebElement> listoftabs = driver.findElements(By.xpath("//div[starts-with(@class,'dW7ZuQ')]"));
		for (WebElement menu : listoftabs) {

			String menuname = menu.getText();

			if (menuname.equals("Logos")) {

				menu.click();
				Thread.sleep(5000);
				driver.switchTo().activeElement().click();
				Thread.sleep(5000);

			}

		}

	}

	@AfterTest()
	public static void closebrowser() throws Exception {
		Thread.sleep(5000);

		driver.quit();
		
	}
	
}
