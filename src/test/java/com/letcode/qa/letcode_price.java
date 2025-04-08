package com.letcode.qa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letcode_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//List<WebElement> price = driver.findElements(By.xpath("//footer/button[@class ='card-footer-item button is-link is-fullwidth']"));
		List<WebElement> priceElements1 = driver.findElements(By.xpath("//footer[@class='card-footer']"));
        List<Double> allPrices = new ArrayList<>();

		for (WebElement p : priceElements1 ) {
			
			String str = p.getText();
			str.trim();
			System.out.println(str);
			String[] Splitprice = str.split(" ");
			for(int i = 0;i<Splitprice.length-1;i++) {
				
				double price = Double.parseDouble(Splitprice[1]);
				allPrices.add(price);
				
			}
				}
				Collections.sort(allPrices);
				double min_prices = Collections.min(allPrices);
				double max_prices = Collections.max(allPrices);

				System.out.println(allPrices);

				System.out.println(min_prices);
				System.out.println(max_prices);

		 driver.quit();

	}

}
