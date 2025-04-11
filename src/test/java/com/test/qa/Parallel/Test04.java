package com.test.qa.Parallel;

import org.testng.annotations.Test;

public class Test04 {
	@Test
	public void TestMethod16() {
		System.out.println("TestClass4 >> TestMethod16 >> "+Thread.currentThread().threadId());
	}
	
	@Test
	public void TestMethod17() {
		System.out.println("TestClass4 >> TestMethod17 >> "+Thread.currentThread().threadId());
	}
	@Test
	public void TestMethod18() {
		System.out.println("TestClass4 >> TestMethod18 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod19() {
		System.out.println("TestClass4 >> TestMethod19 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod20() {
		System.out.println("TestClass4 >> TestMethod20 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod21() {
		System.out.println("TestClass4 >> TestMethod21 >> "+Thread.currentThread().threadId());
	}

}
