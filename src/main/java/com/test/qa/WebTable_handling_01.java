package com.test.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Description;

public class WebTable_handling_01 {
	
	static ChromeDriver driver;
	
	
	@BeforeTest
	
	public static void Open_Browser() {
	
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    driver = new ChromeDriver(options);

		}

	@Description ("Verify and get data from web tables")
	@Test
	public static void handling_webtable() {
		
		String URL = "https://www.w3schools.com/html/html_tables.asp";
				driver.get(URL);
				driver.manage().window().maximize();
				
		//List<WebElement> tablelist = driver.findElements(By.id("customers"));
		List<WebElement> tablelist = driver.findElements(By.xpath("//table[@id=\"customers\"]"));
		//System.out.println(tablelist.get(0));
		 // rows = //table[@id ="customers"]/tbody/tr
		//Columns = //table[@id ="customers"]/tbody/tr[2]/td
		
		int row = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr[2]/td")).size();
		System.out.println(row);
		System.out.println(col);
		
		//List<WebElement> country = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr[2]/td[1]"));
		
		String first_part = "//table[@id =\"customers\"]/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";


		
		for (int i =2; i<=row;i++) {
			
			for (int j=1;j<=col;j++) {
				String Dynamic_path = first_part+i+second_part+j+third_part;
				String data = driver.findElement(By.xpath(Dynamic_path)).getText();
	//			System.out.println(data);
				if (data.contains("Helen Bennett")) {
					
					
					String country_path = Dynamic_path+"/following-sibling::td";
					String company_path = Dynamic_path+"/preceding-sibling::td";
					String country_name=driver.findElement(By.xpath(country_path)).getText();
					String company_name=driver.findElement(By.xpath(company_path)).getText();
					System.out.println("------------------------");
					System.out.println("Helen Bennett is in -- "+country_name);
					System.out.println("Helen Bennett is working in -- "+company_name);

					
				}
				
				
			}
		}
		
		//System.out.println(country.get(0));

		
		
		//.xpath("//table[@id='customers']")
	}
	
	@Test
	public static void handling_webtable1() {
		
		String URL = "https://testautomationpractice.blogspot.com/";
				driver.get(URL);
				driver.manage().window().maximize();
				
		//List<WebElement> tablelist = driver.findElements(By.id("customers"));
		List<WebElement> tablelist = driver.findElements(By.xpath("//table[@id=\"taskTable\"]"));
		//System.out.println(tablelist.get(0));
		 // rows = //table[@id ="customers"]/tbody/tr
		//Columns = //table[@id ="customers"]/tbody/tr[2]/td
		
		int row = driver.findElements(By.xpath("//table[@id =\"taskTable\"]/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id =\"taskTable\"]/tbody/tr[2]/td")).size();
		System.out.println(row);
		System.out.println(col);
		
		//List<WebElement> country = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr[2]/td[1]"));
		
		String first_part = "//table[@id =\"taskTable\"]/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";

		
		for (int i =2; i<=row;i++) {
			
			for (int j=1;j<=col;j++) {
				String Dynamic_path = first_part+i+second_part+j+third_part;
				String data = driver.findElement(By.xpath(Dynamic_path)).getText();
	//			System.out.println(data);
				if (data.contains("96.2 MB")) {
					
					
					String country_path = Dynamic_path+"/following-sibling::td";
					String company_path = Dynamic_path+"/preceding-sibling::td";
					String country_name=driver.findElement(By.xpath(country_path)).getText();
					String company_name=driver.findElement(By.xpath(company_path)).getText();
					System.out.println("------------------------");
					System.out.println("Helen Bennett is in -- "+country_name);
					System.out.println("Helen Bennett is working in -- "+company_name);

					
				}
				
				
			}
		}
		
		//System.out.println(country.get(0));

		
		
		//.xpath("//table[@id='customers']")
	}

	
	@AfterTest
	
	public static void Close_Browser() {
	

		driver.quit();

		}	
	
}


