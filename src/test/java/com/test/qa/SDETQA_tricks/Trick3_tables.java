package com.test.qa.SDETQA_tricks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trick3_tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		List<WebElement> tablelist = driver.findElements(By.xpath("//table[@class='table table-striped']"));
		for(WebElement tabledata : tablelist) {
			
			String rowdata = tabledata.getText();
			System.out.println(rowdata);
		}
		int row = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr[1]/td")).size();
		System.out.println(row);
		System.out.println(col);
		String tablepart1 = "//table[@class='table table-striped']/tbody/tr[";
		String tablepart2 = "]/td[";
		String tablepart3 = "]";

		for(int i =1; i<=row;i++) {
			
			for(int j = 1;j<=col;j++) {
				String DynamicPath = tablepart1+i+tablepart2+j+tablepart3;
				String data = driver.findElement(By.xpath(DynamicPath)).getText();
				if(data.contains("System")) {
					
					String Memorty_path = DynamicPath+"/following-sibling::td";
					String network_path = Memorty_path+"/following-sibling::td";
					String Disk_path = network_path+"/following-sibling::td";
					String memory=driver.findElement(By.xpath(Memorty_path)).getText();
					String network=driver.findElement(By.xpath(network_path)).getText();
					String disk=driver.findElement(By.xpath(Disk_path)).getText();

					System.out.println("------------------------");
					System.out.println("Chrome memory-- "+memory);
					System.out.println("Chrome network -- "+network);
					System.out.println("Chrome network -- "+disk);

				}				
				
			}
		
		}
		
		Thread.sleep(3000);
	driver.quit();
	}

}
