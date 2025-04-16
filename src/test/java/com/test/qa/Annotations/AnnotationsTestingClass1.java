package com.test.qa.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestingClass1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite is executed");
		
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test is executed");
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class is executed");
		
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method is executed");
		
	}
	@Test
	public void Test1() {
		System.out.println("Testcase1 is executed");
		
	}
	@Test
	public void Test2() {
		System.out.println("Testcase2 is executed");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is executed");
		
	}
	@org.testng.annotations.AfterClass
	public void afterclass() {
		System.out.println("After Class is executed");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test is executed");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite is executed");
		
	}
	

}
