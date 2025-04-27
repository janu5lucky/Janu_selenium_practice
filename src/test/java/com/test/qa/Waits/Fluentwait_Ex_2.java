package com.test.qa.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait_Ex_2 {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement firstname = driver.findElement(By.xpath(""));
		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(10));
		mywait.pollingEvery(Duration.ofSeconds(2));
		mywait.until(ExpectedConditions.alertIsPresent());
		
		driver.quit();
	}

}
