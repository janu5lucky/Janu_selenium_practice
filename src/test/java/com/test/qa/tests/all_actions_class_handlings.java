package com.test.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class all_actions_class_handlings {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

	
	 @Description("Verify actions using shift keys")
	    @Test
	    public void test_actions() throws InterruptedException {

	        driver.manage().window().maximize();
	        String URL = "https://awesomeqa.com/practice.html";
	        driver.get(URL);
	        driver.manage().window().maximize();

	        WebElement firstName = driver.findElement(By.name("firstname"));
	        // Keyboards - > keyDown -> Shift -> send key -> key Up

	        Actions actions  = new Actions(driver);
	        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy")
	                .keyUp(Keys.SHIFT).build().perform();

	        Thread.sleep(13000);
	
}
	 
	 @Description("Verify actions Move to Element")
	    @Test
	    public void test_actions_p2() throws InterruptedException {

	        driver.manage().window().maximize();
	        String URL = "https://www.spicejet.com/";
	        driver.get(URL);
	        driver.manage().window().maximize();

	        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
	        Actions actions = new Actions(driver);
//	        actions.moveToElement(source).click().build().perform();
	        actions.moveToElement(source).click().sendKeys("BLR").build().perform();



	 }

	 @AfterTest
	    public void closeBrowser() {
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }
	        driver.quit();
	    }
	 
}