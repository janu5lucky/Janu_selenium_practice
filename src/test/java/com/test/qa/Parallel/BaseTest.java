package com.test.qa.Parallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	@Test (invocationCount =4, invocationTimeOut=40000, threadPoolSize = 2)
	
	public void GetcustomerDetails() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ramdomuser.me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
