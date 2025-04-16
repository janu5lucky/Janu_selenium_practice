package com.letcode.qa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//List<WebElement> price = driver.findElements(By.xpath("//footer/button[@class ='card-footer-item button is-link is-fullwidth']"));
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions act = new Actions (driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement testingdropdown = driver.findElement(By.xpath("//button[starts-with(@id,'kt-accordion-header')]//span[text()='Testing']"));
		mywait.until(ExpectedConditions.visibilityOf(testingdropdown));

		testingdropdown.click();
		
		List<WebElement> dropdownlist = driver.findElements(By.xpath("//ul[@id='java_technologies']"));
	//	mywait.until(ExpectedConditions.visibilityOfAllElements(dropdownlist));
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));

		ArrayList data = new ArrayList();
		
		for (WebElement dropdownElement: dropdownlist ) {
		
			data.add(dropdownElement.getText());
			
		}
		System.out.println("List in testing dropdown : "+data);

	try {
		
		Thread.sleep(3000);
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		driver.quit();
	}
	
//	driver.quit();
	}	
}
