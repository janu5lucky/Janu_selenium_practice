package com.test.qa.retrylogic;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;


public class TestRetryClass {

	@Test
	public void testPassed() {
		System.out.println("test passed!");
		assertTrue(true);
	}

	@Test
	public void testFailed() {
		System.out.println("test failed!- now passed");
		assertTrue(true);
	}

	@Test
	public void testMayFail() {
		int i = new Random().nextInt(10);
		System.out.println("test may fail! - " + i);
		if (i > 5)
			assertTrue(false);
		else
			assertTrue(true);
	}
}
