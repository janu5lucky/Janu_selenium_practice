package com.test.qa.windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String ParentId = driver.getWindowHandle();
		WebElement orangelink = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		orangelink.click();
		//Set<WebElement> links = driver.getWindowHandles();
		
		
	}

}
