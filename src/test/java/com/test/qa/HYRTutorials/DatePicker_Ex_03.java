package com.test.qa.HYRTutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DatePicker_Ex_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstdate = driver.findElement(By.id("first_date_picker"));
		firstdate.click();
		WebElement Datepicker = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));

		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.visibilityOf(Datepicker));
	//	WebElement Datepicker_backmonth= driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
		//Datepicker_backmonth.click();
		Thread.sleep(3000);
		WebElement Datepicker_monthname = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']"));
		String actualmaonthname = Datepicker_monthname.getText();
		Assert.assertEquals(actualmaonthname, "May");
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
