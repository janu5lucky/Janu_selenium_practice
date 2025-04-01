package com.test.qa.tests;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class all_edgeoptions_and_arguments {
	
WebDriver driver;
	
	
	@BeforeTest
	public void browserOpen() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addExtensions(new File("/path/to/extension.crx"));

	//ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",
	     Arrays.asList("disable-popup-blocking"));
	
	
	options.setBinary("/path/to/other/chrome/binary");

	/*
	 from selenium import webdriver
	    from selenium.webdriver.chrome.options import Options

	    chrome_options = Options()
	    chrome_options.add_argument("--start-maximized") # Start maximized
	    chrome_options.add_argument("--headless") # Run in headless mode
	    driver = webdriver.Chrome(options=chrome_options)
	Other Options:
	--incognito: Opens the browser in incognito/private mode. 
	--user-data-dir: Specifies a custom profile directory. 
	--headless or --headless=new: Runs the browser in headless mode (no GUI). 
	--disable-gpu: Disables GPU acceleration. 
	--disable-extensions: Disables browser extensions. 
	--disable-infobars: Disables browser infobars. 
	--disable-popup-blocking: Disables popup blocking. */
	
	
	}

}
