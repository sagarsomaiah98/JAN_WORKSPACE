package com.janbask.staticKeyword;
public class Static_Keyword {
	
 //Static keywords
	
	
	
	static int value= 20;  //Global variables
	
	static String name =" London"; // global variables
	
	public static  void method1() {
		
		
		System.out.println(" method 1");
	}
	
	
	

	public static void main(String[] args) {
		
		/*
		 * Static_Keyword sk = new Static_Keyword();
		 * 
		 * sk.method1(); System.out.println(sk.name); System.out.println(sk.value);
		 */
		
		method1();
		
		System.out.println(value);
		
		System.out.println(name);
		
	}

}
