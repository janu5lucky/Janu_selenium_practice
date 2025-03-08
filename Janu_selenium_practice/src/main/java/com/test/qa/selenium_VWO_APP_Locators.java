package com.test.qa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class selenium_VWO_APP_Locators {

@Description ("Verify the user login VWO App, With Invalid Credentails and verify message")
@Test
public void Test_VWO_APP_locators() {
	
	EdgeOptions edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("--start-maximized");
	edgeOptions.addArguments("--incognito");
	edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	
	
	WebDriver driver = new EdgeDriver(edgeOptions);
	driver.get("https://app.vwo.com");

	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement username = driver.findElement(By.id("login-username"));
	username.sendKeys("user@gmail.com");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("password1123");
	
	WebElement submit_button = driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
	submit_button.click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement error_message  = driver.findElement(By.xpath("//div[@data-qa=\"rixawilomi\"]"));
	String errortext = error_message.getText();
	
	Assert.assertEquals(errortext, "Your email, password, IP address or location did not match");
	
	
	driver.quit();
	

}
	
	
}




