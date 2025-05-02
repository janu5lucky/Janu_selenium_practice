package com.test.qa.HYRTutorials;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandles_Ex_01 {

	@Test
	public void WindowHandle() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String ParentWindow = driver.getWindowHandle();
		
		WebElement windowbtn1 = driver.findElement(By.id("newWindowBtn"));
		windowbtn1.click();
		Set<String> windowhandles = driver.getWindowHandles();
		for(String windowhandle : windowhandles ) {
			System.out.println(windowhandle);
		if(!windowhandle.equals(ParentWindow)) {
			driver.switchTo().window(windowhandle);
			System.out.println(driver.findElement(By.xpath("//img[@id='Header1_headerimg']")).getTagName());
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			driver.findElement(By.id("firstName")).sendKeys("hi hyr");
			Thread.sleep(3000);
	}

}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
}
}
