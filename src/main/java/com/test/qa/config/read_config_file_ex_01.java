package com.test.qa.config;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class read_config_file_ex_01 {
static Properties prop = new Properties();
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read_propfile();
		Intialize_Browser("Edge");
	}

	public static void read_propfile() {
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("D:\\seleniumfiles\\config.properties"));
			prop.load(fis);
		}catch(Exception e ) {
			e.printStackTrace();

		}
	}
	
	public static WebDriver Intialize_Browser(String Browser) {
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		
		}else if(Browser.equals("Edge")) {
			driver = new EdgeDriver();

		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();	

		
		return driver;
		
		
	}
}
