package com.test.qa.AccessModified;

public class executionclass extends AbstractClassEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class1_public obj = new class1_public();
	//	class1_public obj2 = new class1_public("Kumar");// constructor is private not accessible 
	//	abstract_Method();	

		obj.public_method1();
		// obj.private_method1(); not accessible
		
		obj.myname =" Jhansi M ";
		System.out.println(obj.myname);
		String setName = obj.setName2("Jhansi M2");
		System.out.println(setName);

		public_method2();

	
	
	}

	@Override
	public void abstract_Method() {

		System.out.println("abstract method ");
	}

}
