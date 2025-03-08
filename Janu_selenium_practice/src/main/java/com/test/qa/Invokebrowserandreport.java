package com.test.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;

public class Invokebrowserandreport {

		// TODO Auto-generated method stub
	@Owner("Jhansi")
	@Description("Test class for login and report")
	@Test
	public static void InvokeBrowser() throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
Thread.sleep(5000);
//String chromepath = "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe";
driver.get("http://www.facebook.com/");
Thread.sleep(5000);
driver.findElement(By.id("email")).sendKeys("abc.com");
driver.findElement(By.id("pass")).sendKeys("pass");
driver.findElement(By.name("login")).click();
Assert.assertEquals(true, false);
driver.close();


	}
	

}
