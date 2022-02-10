package com.janbask.staticKeyword;

public class Car {
	
	public void method1() {//non static method
		
		System.out.println("method1- non static method");
	}
	
	
	public  static void method2() {
		
		System.out.println("method2 - static method");
	}
	
	public static void main(String[] args) {
		
		//create object of class
		
		
	    
		
		method2();
		
		Car c = new Car();
		c.method1();
		
	}

}
