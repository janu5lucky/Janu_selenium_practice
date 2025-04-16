package com.test.qa.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestingClass2 {
	
	@BeforeSuite
	public void beforesuite2() {
		System.out.println("Before suite2 is executed");
		
	}
	@BeforeTest
	public void beforetest2() {
		System.out.println("Before Test2 is executed");
		
	}
	@BeforeClass
	public void beforeclass2() {
		System.out.println("Before class2 is executed");
		
	}
	
	
	@BeforeMethod
	public void beforemethod2() {
		System.out.println("Before method2 is executed");
		
	}
	@Test
	public void Test3() {
		System.out.println("Testcase3 is executed");
		
	}
	@Test
	public void Test4() {
		System.out.println("Testcase4 is executed");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method2 is executed");
		
	}
	@org.testng.annotations.AfterClass
	public void afterclass() {
		System.out.println("After Class2 is executed");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test2 is executed");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite2 is executed");
		
	}
	

}
