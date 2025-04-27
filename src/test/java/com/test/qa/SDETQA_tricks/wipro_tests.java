package com.test.qa.SDETQA_tricks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wipro_tests {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 WebElement name = driver.findElement(By.xpath("//input[@maxlength=15 or @id='name']"));
		 String str =  name.getAttribute("placeholder");
		 System.out.println(str);
		 str =  name.getText();
		 System.out.println(str);

		 name.sendKeys("Hi");
		 Thread.sleep(3000);
		 
		 driver.quit();

	}

}
