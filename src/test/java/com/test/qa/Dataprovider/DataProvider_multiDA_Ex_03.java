package com.test.qa.Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_multiDA_Ex_03 {
	
	
	@Test (dataProvider = "dp1")
	public void test_multi_dimensionalarray(String[] s){
	 System.out.println(s[0] +" >> " + s[1]);	
	
	}
	
	@Test (dataProvider = "dp1")
	public void test_multi_dimensionalarray(String username ,String password){
	 System.out.println(username +" -- " + password);	
	
	}
	
	@Test (dataProvider = "dp2")
	public void test_jagged_array(String[] s){
		
		for (int i =0; i<s.length; i++) {
			
		 System.out.println(s[i]);	
		 
		}
		 System.out.println(" >>>>> ");	

	}
	
	@DataProvider()
	public String[][] dp1(){
		
		String[][] data = new String[][]{
				{"abcd","123"},
				{"ijkl","456"},
				{"qrst","789"},
				{"yz", "ABC"}
	};
		
		return data;
			
	}
	@DataProvider()
	public String[][] dp2(){
		
		String[][] data = new String[][]{
				{"abcd","123","dcnmw","1212"},
				{"ijkl","456"},
				{"qrst","789"},
				{"yz", "ABC","DEF"}
	};
		
		return data;
			
	}

}
