package com.test.qa.linksandstrings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class findAllLinksOnpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+links.size());
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
