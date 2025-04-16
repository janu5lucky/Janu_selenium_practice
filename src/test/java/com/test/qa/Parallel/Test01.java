package com.test.qa.Parallel;

import org.testng.annotations.Test;

public class Test01 {
	
	
	@Test
	public void TestMethod01() {
		System.out.println("TestClass1 >> TestMethod1 >> "+Thread.currentThread().threadId());
	}
	
	@Test
	public void TestMethod02() {
		System.out.println("TestClass1 >> TestMethod2 >> "+Thread.currentThread().threadId());
	}
	@Test
	public void TestMethod03() {
		System.out.println("TestClass1 >> TestMethod3 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod04() {
		System.out.println("TestClass1 >> TestMethod4 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod05() {
		System.out.println("TestClass1 >> TestMethod5 >> "+Thread.currentThread().threadId());
	}

	@Test
	public void TestMethod06() {
		System.out.println("TestClass1 >> TestMethod6 >> "+Thread.currentThread().threadId());
	}

	}
