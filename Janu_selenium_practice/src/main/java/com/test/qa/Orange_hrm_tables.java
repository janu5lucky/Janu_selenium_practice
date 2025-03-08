package com.test.qa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Orange_hrm_tables {

		
 ChromeDriver driver;
	
	
	@BeforeTest
	
	public  void Open_Browser() {
	
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    driver = new ChromeDriver(options);

		}

	@Description ("Verify and get data from web tables of Orange HRM ")
	@Test
	public  void handling_webtable() {
		
		String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				driver.get(URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		
		WebElement button = driver.findElement(By.xpath("//button [@type=\"submit\"]"));
		button.click();
		
			
		WebElement dashboard = driver.findElement(By.xpath("//h6 [text()=\"Dashboard\"]"));
		String dashboardtext = dashboard.getText();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String Homedashboard = "Dashboard";
		Assert.assertEquals(dashboardtext, Homedashboard, "Assertion results");
				
		WebElement PIM = driver.findElement(By.xpath(""));
	// Enter Username Password
				
		Actions actions = new Actions(driver);	
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//List<WebElement> tablelist = driver.findElements(By.id("customers"));
		List<WebElement> tablelist = driver.findElements(By.xpath("//div[@role=\"table\"]"));
		
		////div[@role="table"]/div[@role='rowgroup']/div[@class='oxd-table-body oxd-card-table-body']
		////System.out.println(tablelist.get(0));
		 // rows = //table[@id ="customers"]/tbody/tr
		//Columns = //table[@id ="customers"]/tbody/tr[2]/td
		
		
		//// //div[@role="table"]/div/div/div/div[1]/div
	//	  //div[@role="table"]/div/div/div/div[1]/div[2]
		//div[@role="table"]/div/div/div/div/div[1]
		
		int row = driver.findElements(By.xpath("//div[@role=\"table\"]/div/div")).size();
		int col = driver.findElements(By.xpath("//div[@role=\"table\"]/div/div/div/div/div")).size();
		System.out.println(row);
		System.out.println(col);
		
		//List<WebElement> country = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr[2]/td[1]"));
		
		String first_part = "//div[@role=\\\"table\\\"]/div/div/div/div[";
		String second_part = "]/div[";
		String third_part = "]";


		
		for (int i =1; i<=row;i++) {
			
			for (int j=1;j<=col;j++) {
				String Dynamic_path = first_part+i+second_part+j+third_part;
				String data = driver.findElement(By.xpath(Dynamic_path)).getText();
	//			System.out.println(data);
				if (data.contains("0295")) {
					
					
					String country_path = Dynamic_path+"/following-sibling::td";
					String company_path = Dynamic_path+"/preceding-sibling::td";
					String country_name=driver.findElement(By.xpath(country_path)).getText();
					String company_name=driver.findElement(By.xpath(company_path)).getText();
					System.out.println("------------------------");
					System.out.println("Data "+country_name);
					System.out.println("Data 2 -- "+company_name);

					
				}
				
				
			}
		}
		
		//System.out.println(country.get(0));

		
		
		//.xpath("//table[@id='customers']")
	}
	
	
	@AfterTest
	
	public  void Close_Browser() {
	

		driver.quit();

		}	
	
	
}
