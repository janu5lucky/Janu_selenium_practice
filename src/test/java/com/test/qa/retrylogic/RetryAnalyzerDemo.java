package com.test.qa.retrylogic;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;


public class RetryAnalyzerDemo implements IRetryAnalyzer
{
	int initialCount=0;
	int macCount=3;

	public boolean retry(ITestResult result) {
		if(initialCount<macCount)
		{
			initialCount++;
			return true;
		}
		return false;
	}

}


