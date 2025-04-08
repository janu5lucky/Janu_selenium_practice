package com.test.qa.Parallel;

import org.testng.annotations.Test;

public class Test03 {
	@Test
	public void TestMethod10() {
		System.out.println("TestClass3 >> TestMethod10 >> "+Thread.currentThread().threadId());
	}
	
	@Test
	public void TestMethod11() {
		System.out.println("TestClass2 >> TestMethod11 >> "+Thread.currentThread().threadId());
	}
	@Test
	public void TestMethod12() {
		System.out.println("TestClass3 >> TestMethod12 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod13() {
		System.out.println("TestClass3 >> TestMethod13 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod14() {
		System.out.println("TestClass3 >> TestMethod14 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod15() {
		System.out.println("TestClass3 >> TestMethod15 >> "+Thread.currentThread().threadId());
	}

}
