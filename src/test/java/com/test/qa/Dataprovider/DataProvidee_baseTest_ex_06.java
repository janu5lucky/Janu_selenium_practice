package com.test.qa.Dataprovider;

import org.testng.annotations.Test;

public class DataProvidee_baseTest_ex_06 {

	
	@Test (dataProvider = "dp4", dataProviderClass = DataSupplier_Ex_06.class)
	public void Test_DataSupplier(String s){
	 System.out.println(s);	
	 
	}
}
