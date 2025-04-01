package com.test.qa.tests;

import org.testng.annotations.Test;

public class groups_testng {

	 @Test (groups = {"Smoke", "Regression"})
	 public void Test1() {
		 
		 System.out.println("Test1");
		 
	 }
	 @Test (groups = {"Smoke", "Regression"})
	 public void Test2() {
		 
		 System.out.println("Test2");
		 
	 } @Test (groups = {"Sanity", "Regression"})
	 public void Test3() {
		 
		 System.out.println("Test3");
		 
	 } @Test (groups = {"Sanity", "Regression"})
	 public void Test4() {
		 
		 System.out.println("Test4");
		 
	 } @Test (groups = "Smoke")
	 public void Test5() {
		 
		 System.out.println("Test5");
		 
	 } @Test (groups = "Regression")
	 public void Test6() {
		 
		 System.out.println("Test6");
		 
	 } @Test (groups = {"Smoke", "Regression","Sanity"})
	 public void Test7() {
		 
		 System.out.println("Test7");
		 
	 }

}
 