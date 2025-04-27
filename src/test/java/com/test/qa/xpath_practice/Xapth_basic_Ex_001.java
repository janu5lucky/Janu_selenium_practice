package com.test.qa.xpath_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xapth_basic_Ex_001 {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// chapter2();
		// chapter3();
		// chapter4();
		// chapter5();
		// chapter6();
		//chapter7();
		chapter8();

	}

	public static void highlight(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		// arguments[0].setAttribute('style', 'border:2px solid red; background:yellow'

	}

	public static void chapter2() throws Exception {
		// Types of Xpath - Absolute and Relative
		driver.get("https://www.w3schools.com/");

		// Absolute
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/a[3]"));
		highlight(element);
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[1]/a[4]"));
		highlight(element2);

		Thread.sleep(3000);
		// relative
		WebElement element3 = driver.findElement(By.xpath("//nav/a[1]"));
		highlight(element3);
		Thread.sleep(3000);

		WebElement element4 = driver.findElement(By.xpath("//a[@title='Our Services']"));
		highlight(element4);
		Thread.sleep(3000);

		driver.quit();

	}

	public static void chapter3() throws Exception {

		// Xpath Using Attributes

		// div[@id='tnb-google-search-mobile-show']

		driver.get("https://www.w3schools.com/");
		WebElement element4 = driver.findElement(By.xpath("//input[@id='tnb-google-search-input']"));
		element4.click();
		Thread.sleep(3000);
		List<WebElement> elementID = driver.findElements(By.xpath("//a[@id]"));
		String id;
		for (WebElement element : elementID) {
			id = element.getText();
			System.out.println(id);
		}
		Thread.sleep(3000);

		driver.quit();

	}

	public static void chapter4() throws Exception {

		// Xpath Using Operators ==, !=, <=, >=, <,>

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		// WebElement element4 = driver.findElement(By.xpath("//input[@maxlength=10]"));
		WebElement element4 = driver.findElement(By.xpath("//input[@maxlength<=11]"));

		element4.sendKeys("Hi text");
		Thread.sleep(3000);
		// WebElement element = driver.findElement(By.xpath("//input[@maxlength!=10]"));
		WebElement element = driver.findElement(By.xpath("//input[@maxlength>=15]"));

		element.sendKeys("Hi text2");
		Thread.sleep(3000);

		driver.quit();

	}

	public static void chapter5() throws Exception {

		// Xpath Using Conditions- AND , OR , NOT

		// div[@id='tnb-google-search-mobile-show']

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//	WebElement element4 = driver.findElement(By.xpath("//input[@maxlength=10]"));
		WebElement element4 = driver.findElement(By.xpath("//input[@maxlength<=11 and @name='name']"));

		element4.sendKeys("Hi text");
		Thread.sleep(3000);
//	WebElement element = driver.findElement(By.xpath("//input[@maxlength!=10]"));
		List<WebElement> element = driver.findElements(By.xpath("//input[@maxlength>=15 or @name='name']"));

		for (WebElement e : element) {
			String s = e.getText();
			System.out.println(s);
		}
		Thread.sleep(3000);
		List<WebElement> element1 = driver.findElements(By.xpath("//input[not(@maxlength=15)]"));

		for (WebElement e1 : element1) {
			String s1 = e1.getText();
			System.out.println(s1);
		}
		Thread.sleep(3000);

		driver.quit();

	}

	public static void chapter6() throws Exception {

		// Xpath Using Conditions- AND , OR , NOT

		// div[@id='tnb-google-search-mobile-show']

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		List<WebElement> element1 = driver.findElements(By.xpath("//table[@id='contactList']/tbody/tr[2]/td"));
		Thread.sleep(3000);

		for (WebElement e1 : element1) {
			String s1 = e1.getText();
			if (e1 == element1.getFirst()) {

				e1 = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]/td//input[@type='checkbox']"));
				s1 = e1.getAttribute("type");
				e1.click();
				Thread.sleep(3000);

			}
			System.out.println(s1);
		}
		Thread.sleep(3000);
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[23]")));
		Thread.sleep(3000);

		driver.quit();

	}

	public static void chapter7() throws Exception {

		// Xpath Using Functions
		// text(), contains(), normalized-space(), start-with(), positions(), Last()

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		// act.sendKeys(Keys.ARROW_DOWN).perform();

		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		// Thread.sleep(3000);
		// text()
		// highlight(driver.findElement(By.xpath("//a[text()='Sign in']")));
		// Thread.sleep(3000);

		// ***----contains with attribute giving partial value
		// highlight(driver.findElement(By.xpath("//div[contains(@class,'signin')]")));
		// act.sendKeys(Keys.PAGE_UP).perform();
		// Thread.sleep(3000);
		// act.sendKeys(Keys.PAGE_UP).perform();
		// *****------contains with text()
		// highlight(driver.findElement(By.xpath("//a[contains(text(),'account')]")));
		// Thread.sleep(3000);
		// ******** ---------starts with text()
		// highlight(driver.findElement(By.xpath("//a[starts-with(text(),'Sign in
		// into')]")));

		// Thread.sleep(3000);
		// ******** ---------starts with attribute()
		// highlight(driver.findElement(By.xpath("//div[starts-with(@class,'container
		// ')]")));
		// Thread.sleep(3000);

		// ******** ---------normalize-space with text()
		// highlight(driver.findElement(By.xpath("//label[normalize-space(text())='First
		// Name']")));
		// Thread.sleep(3000);

		// ***** --------My experiment --- Wrong implementation
		// highlight(driver.findElement(By.xpath("//label[starts-with(text(),'First')
		// and last(text(),'Name ')]")));

		// ***** --------Last() ---

		// highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[last()]")));

		// Thread.sleep(3000);
		// //label[starts-with(text(),'First')]

		// (//table[@id='contactList']/tbody/tr/td)[last()]

		// ***** --------Position() ---

		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")));

		Thread.sleep(3000);
		driver.quit();

	}

	public static void chapter8() throws Exception {

		// Xpath Using Functions
		// text(), contains(), normalized-space(), start-with(), positions(), Last()

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		// act.sendKeys(Keys.ARROW_DOWN).perform();

		Thread.sleep(3000);
		//*************------------ Using following sibling
	//	highlight(driver.findElement(By.xpath("//input[@maxlength = 10]/following-sibling::label[text()='Last Name']")));
//		Thread.sleep(3000);

//		highlight(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));

		
		//**********------------- Using Preceeding sibling
		highlight(driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[@maxlength=15]")));
	//	act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();


		WebElement check = driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td"));
		highlight(check);
	//	check.click();
		Thread.sleep(3000);

		//**********------------- Using Parent

		WebElement check2 = driver.findElement(By.xpath("//td[text()='Helen Bennett']/parent::tr"));
		highlight(check2);
		Thread.sleep(3000);
		//**********------------- Using Child

		WebElement check3 = driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input"));
		check3.click();
		Thread.sleep(3000);
		act.sendKeys(Keys.END).perform();

		Thread.sleep(3000);

		driver.quit();
		
		
		
	}

}
