package com.test.qa.JavaScriptExecutor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class movetoelementandscrollup {

	@Test(enabled = false)
	public void TC1_ZoominZoomout() throws Exception {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.transform = 'scale(0.5)'");
		Thread.sleep(3000);
		jse.executeScript("document.body.style.transform = 'scale(1.5)'");
		Thread.sleep(3000);
		jse.executeScript("document.body.style.transform = 'scale(1.0)'");
		Thread.sleep(3000);

		driver.quit();

	}

	@Test
	public void TC2_MovetoElement() throws Exception {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement flink = driver.findElement(By.xpath("//li [@class='social_facebook']"));
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.visibilityOf(flink));
		jse.executeScript("arguments[0].scrollIntoView(true);", flink);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow');", flink);
		Thread.sleep(3000);
// scroll up 
		jse.executeScript("window.scrollBy(0,-350)","");
		Thread.sleep(5000);

		driver.quit();

	}

	@Test
	public void TC3_MovetoPageEnd() throws Exception {
		
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		List<WebElement> newbooks = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		ArrayList<String> booktitles = new ArrayList<String>();
		for (WebElement newbook : newbooks ) {
			
			booktitles.add(newbook.getText());
			
			
		}
		
		
		
		System.out.println("no.of new books : "+booktitles.size());
		System.out.println("no.of new books : "+booktitles);

		driver.quit();
		


	}

	@Test
	public void TC4_HandleAlert() {

	}
}
