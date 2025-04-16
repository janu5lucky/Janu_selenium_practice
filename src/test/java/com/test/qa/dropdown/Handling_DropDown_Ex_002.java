package com.test.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_DropDown_Ex_002 {

@Test
public void verify_dropdown_select_visibility() throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		// List<WebElement> countrylist = driver.findElements(By.cssSelector("select#country"));
		Select countries = new Select(driver.findElement(By.cssSelector("select#country")));
		//List<WebElement> countrylist =countries.getOptions();
		countries.selectByVisibleText("India");
		//System.out.println(countrylist);
		Thread.sleep(3000);
		
		System.out.println("country selected : Inida ");
		
		driver.quit();
	}


@Test
public void verify_dropdown_select_index() throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		// List<WebElement> countrylist = driver.findElements(By.cssSelector("select#country"));
		Select countries = new Select(driver.findElement(By.cssSelector("select#country")));
 	
		countries.selectByIndex(4);
		Thread.sleep(3000);

		System.out.println("country selected : index 4 ");
		
		driver.quit();
	}


@Test
public void verify_dropdown_select_visiblevalue() throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		String country = "China";
		// List<WebElement> countrylist = driver.findElements(By.cssSelector("select#country"));
		Select countries = new Select(driver.findElement(By.cssSelector("select#country")));
 	
		countries.selectByValue(country);
		Thread.sleep(3000);

		System.out.println("country selected : Value China ");
		
		driver.quit();
	}



}
