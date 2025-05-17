package com.bookmyshow.qa;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bookmyshow_location_ex_01 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		String parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String parent = driver.getWindowHandle();
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	ewait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windows = new LinkedHashSet<>();
		windows = driver.getWindowHandles();
		for(String window : windows) {
			
			if(!window.equals(parent)) {
				driver.switchTo().window(window);
				
			}
		}
		
		List<WebElement> places = driver.findElements(By.xpath("//ul[@class='bwc__sc-ttnkwg-15 fFoiPE']/li"));
		for(WebElement place : places) {
			String placename = place.getText();
		System.out.println(placename);	
			if(placename.equals("Hyderabad")) {
				//ul[@class='bwc__sc-ttnkwg-15 fFoiPE']/li[4]
				place.click();
			}
			
		}
		ewait.until(ExpectedConditions.numberOfWindowsToBe(1));
		WebElement searchbox = driver.findElement(By.xpath("//div[@class='bwc__sc-m1rlyj-3 bwc__sc-1nbn7v6-5 gGGcMk bEMMvn']"));
		ewait.until(ExpectedConditions.visibilityOf(searchbox));
		//searchbox.sendKeys("HIT 3");
		WebElement searchtextbox = driver.findElement(By.xpath("//span[@id=4]"));
		searchtextbox.click();
		WebElement entertext = driver.findElement(By.xpath("//input[@class='bwc__sc-1iyhybo-6 dqucKB']"));
		entertext.sendKeys("HIT");
		
		
	driver.quit();	
	}

}
