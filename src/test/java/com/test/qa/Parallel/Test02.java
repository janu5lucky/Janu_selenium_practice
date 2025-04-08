package com.test.qa.Parallel;

import org.testng.annotations.Test;

public class Test02 {

	@Test
	public void TestMethod07() {
		System.out.println("TestClass2 >> TestMethod7 >> "+Thread.currentThread().threadId());
	}
	
	@Test
	public void TestMethod08() {
		System.out.println("TestClass2 >> TestMethod8 >> "+Thread.currentThread().threadId());
	}
	@Test
	public void TestMethod09() {
		System.out.println("TestClass2 >> TestMethod9 >> "+Thread.currentThread().threadId());
	}
	
}
