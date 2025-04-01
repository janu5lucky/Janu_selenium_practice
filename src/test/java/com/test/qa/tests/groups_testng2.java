package com.test.qa.tests;

import org.testng.annotations.Test;

public class groups_testng2 {
	
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
		 
	 } @Test (groups = "Regression")
	 public void Test13() {
		 
		 System.out.println("Test13");
		 
	 } @Test (groups = {"Smoke", "Regression","Sanity"})
	 public void Test14() {
		 
		 System.out.println("Test14");
		 
	 }

	

}
