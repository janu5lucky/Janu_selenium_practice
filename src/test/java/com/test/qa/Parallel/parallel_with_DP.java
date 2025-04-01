package com.test.qa.Parallel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parallel_with_DP {
	WebDriver driver;

	@BeforeTest
	public void browserOpen() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);

	}

	@Test(dataProvider = "logindata")
	public void testLogin_parallel(String Username, String Password) throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(7000);

		WebElement username = driver.findElement(By.xpath("//input [@placeholder='Username']"));
		username.sendKeys(Username);
		WebElement password = driver.findElement(By.xpath("//input[@name =\"password\"]"));
		password.sendKeys(Password);
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(7000);

		String title = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();

		String title2 = "Dashboard";
		assertEquals(title, title2, "Logged IN ");

		WebElement logoutdrop = driver
				.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]"));
		logoutdrop.click();
		Thread.sleep(2000);

		WebElement logoutbutton = driver.findElement(By.xpath("//ul/li/a[contains(.,'Logout')]"));
		logoutbutton.click();
		Thread.sleep(2000);

	}

	@DataProvider(parallel = false)
	public Object[][] logindata() {
		Object[][] data = new Object[6][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "admin123";

		data[2][0] = "Admin";
		data[2][1] = "admin123";

		data[3][0] = "Admin";
		data[3][1] = "admin123";

		data[4][0] = "Admin";
		data[4][1] = "admin123";

		data[5][0] = "Admin";
		data[5][1] = "admin123";

		return data;

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

}
