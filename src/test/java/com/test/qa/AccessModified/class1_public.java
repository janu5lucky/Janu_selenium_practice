package com.test.qa.AccessModified;

public class class1_public {
 private String name ="";
 public static String myname ="";
 private String name2 ="";

	
	protected class1_public(){
		System.out.println("public class1_public.class : Constructor no access modifier given");

	}
	private class1_public(String abc){
		System.out.println("public class1_public.class : Constructor private access modifier given"+abc);

	}

	private static void private_method1() {
		
		System.out.println("public class1_public.class : Private Method1");
	}
	
public static void public_method1() {
		
		System.out.println("public class1_public.class : public Method1");
	}

//abstract void Abstract_method2();
public String getName2() {
	return name2;
}
public String setName2(String name2) {
	this.name2 = name2;
	return name2;
}
	
}
