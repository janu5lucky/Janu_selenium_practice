package com.test.qa.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ebay_pagenametion_gemeni {
	

	    public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	  //      System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Replace with your chromedriver path

	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed

	        try {
	            driver.get("https://www.ebay.com/");

	            // Find the search input field and enter "mac mini"
	            WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-ac")));
	            searchInput.sendKeys("mac mini");

	            // Find the search button and click it
	            WebElement searchButton = driver.findElement(By.id("gh-btn"));
	            searchButton.click();

	            boolean found = false;
	            int pageNumber = 1;

	            while (!found) {
	                // Wait for the search results to load
	                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.s-item")));

	                // Get all search result items
	                List<WebElement> items = driver.findElements(By.cssSelector("li.s-item"));

	                for (WebElement item : items) {
	                    try {
	                        // Extract the title of the item
	                        WebElement titleElement = item.findElement(By.cssSelector(".s-item__title"));
	                        String title = titleElement.getText();

	                        // Check if the title matches the target title
	                        if (title.contains("🍏 2018 - 2020 Apple Mac Mini Up to 3.2GHz i7 6-Core 64GB RAM 2TB SSD Warranty")) {
	                            System.out.println("Found the item on page " + pageNumber + ": " + title);
	                            found = true;
	                            // Optionally, click on the item to view details:
	                            titleElement.click();
	                            break; // Exit the loop as the item is found
	                        }
	                    } catch (org.openqa.selenium.NoSuchElementException e) {
	                        // Handle cases where an element is not found within an item
	                        //This can happen if some items are sponsored, or structured differently.
	                        System.out.println("Item structure changed on page: " + pageNumber + ". Skipping item.");
	                    }

	                }

	                if (!found) {

	                    try{
	                        //Try to find the next page button.
	                        WebElement nextPageButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.pagination__item.pagination__item--next")));
	                        nextPageButton.click();
	                        pageNumber++;
	                        wait.until(ExpectedConditions.stalenessOf(items.get(0))); //wait for page to fully load.

	                    }catch(org.openqa.selenium.NoSuchElementException e){
	                        System.out.println("Next page button not found. End of pages reached.");
	                        break;
	                    }catch(org.openqa.selenium.StaleElementReferenceException e){
	                        System.out.println("Stale Element Reference Exception. Page reload.");
	                        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.s-item")));
	                        items = driver.findElements(By.cssSelector("li.s-item"));
	                    }
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
	}
	


