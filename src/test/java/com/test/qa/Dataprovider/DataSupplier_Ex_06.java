package com.test.qa.Dataprovider;

import org.testng.annotations.DataProvider;

public class DataSupplier_Ex_06 {
	@DataProvider(indices = {0,3,6})
	public String[] dp4() {
		
		
		String[] data = {"abcd", "efgh","ijkl","mnop","qrst", "uvwx", "yz"};
		
		return data;
	}
}
