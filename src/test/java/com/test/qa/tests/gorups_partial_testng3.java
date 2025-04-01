package com.test.qa.tests;

import org.testng.annotations.Test;
@Test (groups = {"all"})

public class gorups_partial_testng3 {
	
	@Test (groups = {"Smoke", "Regression"})
	 public void Test8() {
		 
		 System.out.println("Test8");
		 
	 }
	 @Test (groups = {"Smoke", "Regression"})
	 public void Test9() {
		 
		 System.out.println("Test9");
		 
	 } @Test (groups = {"Sanity", "Regression"})
	 public void Test10() {
		 
		 System.out.println("Test10");
		 
	 } @Test (groups = {"Sanity", "Regression"})
	 public void Test11() {
		 
		 System.out.println("Test11");
		 
	 } @Test (groups = "Smoke")
	 public void Test12() {
		 
		 System.out.println("Test12");
		 
	 } @Test
	 public void Test13() {
		 
		 System.out.println("Test13");
		 
	 } @Test 
	 public void Test14() {
		 
		 System.out.println("Test14");
		 
	 }


	

}
