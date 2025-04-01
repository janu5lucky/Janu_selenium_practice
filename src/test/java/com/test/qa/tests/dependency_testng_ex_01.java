package com.test.qa.tests;

import org.testng.annotations.Test;

public class dependency_testng_ex_01 {
	String Trackingnumber ;
	
	
	@Test
	public void createShipment() {
		
		//System.out.println(5/0);
		System.out.println("Create shiptment");
		Trackingnumber = "a1v2b3ner4";
		
	}

	@Test (dependsOnMethods= {"createShipment"})
	public void trackShipment() throws Exception{
		
		if(Trackingnumber!=null) {
		System.out.println("Track shiptment");
	}else
	{
		throw new Exception("Invalid Tracking number");
		
	}
	}
	@Test (dependsOnMethods= {"createShipment","trackShipment"})
	public void cancelShipment() throws Exception {
		
		if(Trackingnumber!=null) {
			System.out.println("Cancel shiptment");
		}else
		{
			throw new Exception("Invalid Tracking number");
			
		}
	}

}
