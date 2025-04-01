package com.test.qa.Dataprovider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Iterator_DataProvider_Ex_04 {
	
	
	@Test (dataProvider = "dp1")
	public void test_iterator_List_01(String s) {
		System.out.println(s);
		
	}
	
	@Test (dataProvider = "dp2")
	public void test_iterator_Set_02(String s) {
		System.out.println(s);
			
	}
	@Test (dataProvider = "dp3")
	public void test_iterator_Set_array_02(String[] s) {
		System.out.println(s[0]+" >> "+s[1]);
			
	}
	
	
	@DataProvider 
	public Iterator<String> dp1() {
		List<String> data = new ArrayList<>();
		data.add("abc-List");
		data.add("def-list");
		data.add("ghi-list");

		return data.iterator();
		
		
	}
	@DataProvider 
	public Iterator<String> dp2() {
		Set<String> data = new HashSet<>();
		data.add("abc-Set");
		data.add("def-Set");
		data.add("ghi-Set");

		return data.iterator();
		
		
	}
	
	@DataProvider 
	public Iterator<String[]> dp3() {
		Set<String[]> data = new HashSet<>();
		data.add(new String[] {"abc-Set", "123-Set"});
		data.add(new String[] {"def-Set", "456-Set"});
		data.add(new String[] {"ghi-Set", "789-Set"});

		return data.iterator();
		
		
	}
}
