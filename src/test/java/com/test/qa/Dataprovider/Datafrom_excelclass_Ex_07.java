package com.test.qa.Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.qa.Excel.Excel_data_provider_supplier_Ex_07;

public class Datafrom_excelclass_Ex_07 {

	@Test(dataProvider = "Logindata", dataProviderClass = Excel_data_provider_supplier_Ex_07.class)
	public static void testdatafrom_excel_DPclass(String Username, String Password) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(5000);

		WebElement username = driver.findElement(By.xpath("//input [@placeholder='Username']"));
		username.sendKeys(Username);
		WebElement password = driver.findElement(By.xpath("//input[@name =\"password\"]"));
		password.sendKeys(Password);
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();

		driver.close();
	//	System.out.println(s);

	}

}
