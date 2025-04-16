package com.test.qa.dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_drop_down_Ex_001 {

		// TODO Auto-generated method stub
@Test
public void VerifySorted_options01() throws Exception{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		Thread.sleep(3000);
		options.addArguments("window-size=800,1000");
		
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//List<WebElement> colorslist = driver.findElements(By.cssSelector("select#colors"));
		//List<WebElement> sortedlist = colorslist.sort(Comparatot);
		Select colordropdown = new Select(driver.findElement(By.cssSelector("select#colors")));
		List<WebElement> colorslist = colordropdown.getOptions();

		ArrayList originallist = new ArrayList();
		ArrayList sortedcolorlist = new ArrayList();

		for(WebElement coloroption:colorslist ) {
			
			originallist.add(coloroption.getText());
			sortedcolorlist.add(coloroption.getText());
		}
		
		//sortedcolorlist = originallist.sort(null)
		System.out.println("Before sorting");
		System.out.println(("original list "+originallist));
		System.out.println("Sorted List"+sortedcolorlist);

		Collections.sort(sortedcolorlist);
		System.out.println("After sorting");

		System.out.println("Original List"+originallist);
		System.out.println("Sorted List"+sortedcolorlist);

		if(originallist.equals(sortedcolorlist)) {
			
			System.out.println("the dropdown options are sorted ");
		}else {
			System.out.println("the dropdown options are not sorted ");

		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

@Test
public void Verify_dropdownlist_sorted_02() throws Exception {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Select animalsdropdown = new Select(driver.findElement(By.cssSelector("select#animals")));
	
	List<WebElement> animals = animalsdropdown.getOptions();
	
	ArrayList original = new ArrayList();
	ArrayList sorted = new ArrayList();
	
	
	for(WebElement animal : animals) {
		
		original.add(animal.getText());
		sorted.add(animal.getText());

	}
	
	System.out.println("Before Sorting");
	System.out.println("Before Sorted- original "+original);
	System.out.println("Before Sorted - Sorted "+sorted);
	
	Collections.sort(sorted);
	
	System.out.println("After Sorting");
	System.out.println("After Sorted - Original "+original);
	System.out.println("After Sorted - Sorted "+sorted);
	
	if(original.equals(sorted)) {
		
		System.out.println("Animals are sorted");
		
	}else {
		System.out.println("Animals are not sorted");

	}
	Thread.sleep(3000);
	driver.quit();

}

}
