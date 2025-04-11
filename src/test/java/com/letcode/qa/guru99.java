package com.letcode.qa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//List<WebElement> price = driver.findElements(By.xpath("//footer/button[@class ='card-footer-item button is-link is-fullwidth']"));
		List<WebElement> priceElements1 = driver.findElements(By.xpath("//footer[@class='card-footer']"));
        List<Double> allPrices = new ArrayList<>();

		for (WebElement p : priceElements1 ) {
			
		}
		
	}

}
