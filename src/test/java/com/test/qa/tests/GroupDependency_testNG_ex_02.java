package com.test.qa.tests;

import org.testng.annotations.Test;

public class GroupDependency_testNG_ex_02 {

	
	@Test (groups = {"Smoke"})
	 public void Test1() {
		 System.out.println(5/0);

		 System.out.println("Smoke");
		 
	 }
	 @Test (groups = {"Smoke"})
	 public void Test2() {
		 
		 System.out.println("Smoke");
		 
	 } @Test (groups = {"Sanity"})
	 public void Test3() {
		 
		 System.out.println("Sanity");
		 
	 } @Test (groups = {"Sanity"})
	 public void Test4() {
		 
		 System.out.println("Sanity");
		 
	 } @Test (groups = "Smoke")
	 public void Test5() {
		 
		 System.out.println("Smoke");
		 
	 } @Test (groups = "Regression")
	 public void Test6() {
		 
		 System.out.println("Regression");
		 
	 } @Test (groups = {"Smoke"})
	 public void Test7() {
		 
		 System.out.println("Regression");
	 }	
		 @Test (dependsOnGroups = "Regression")
		 public void Test0() {
			 
			 System.out.println("Main Test");
			 	 
	 }

}
