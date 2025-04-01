package com.test.qa.Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indices_DataProvider_Ex_05 {

	@DataProvider(indices = {0,3,6})
	public String[] dp4() {
		
		
		String[] data = {"abcd", "efgh","ijkl","mnop","qrst", "uvwx", "yz"};
		
		return data;
	}
	 
	@Test(dataProvider = "dp4")
	public void test_indices_DP4(String s) {
		
	System.out.println(s);	
	}
	
}
