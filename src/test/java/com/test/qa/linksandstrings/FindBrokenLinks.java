package com.test.qa.linksandstrings;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FindBrokenLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+links.size());
		Thread.sleep(5000);
		
		for (WebElement link : links) {
			String LinkUrl = link.getAttribute("href");
			URL url = new URL(LinkUrl);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpurlconnection = (HttpURLConnection) urlconnection;
			httpurlconnection.setConnectTimeout(5000);
			
			httpurlconnection.connect();
			if(httpurlconnection.getResponseCode()==200) {
				System.out.println(LinkUrl +" - "+httpurlconnection.getResponseCode()+" - "+httpurlconnection.getResponseMessage());
				
			}else {
				System.err.println(LinkUrl +" - "+httpurlconnection.getResponseCode()+" - "+httpurlconnection.getResponseMessage());
			}
			
			
		}

		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
