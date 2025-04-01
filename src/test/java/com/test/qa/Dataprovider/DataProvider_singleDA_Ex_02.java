package com.test.qa.Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_singleDA_Ex_02 {
	
	
	
	@Test (dataProvider = "dp1")
	public void testsingledimentionalarray(String s){
	 System.out.println(s);	
	
	}
	
	@Test (dataProvider = "dp2")
	public void testsingledimentionalarray(Integer i){
	 System.out.println(i);	
	
	}
	
	@Test (dataProvider = "dp3")
	public void testsingledimentionalarray(Object obj){
	 System.out.println(obj);	
	
	}
	
	@DataProvider()
	public String[] dp1(){
		
		String[] data = new String[] {"abcd","efgh","ijkl","mnop","qrst","uvwx","yz"};
		
		return data;
			
	}
	
	
	@DataProvider()
	public Integer[] dp2(){
		
		Integer[] data = new Integer[] {1,2,3,4};
		
		return data;
			
	}
	
	@DataProvider()
	public Object[] dp3(){
		
		Object[] data = new Object[] {1,"abc",3,"def",23.3343f};
		
		return data;
			
	}

}
