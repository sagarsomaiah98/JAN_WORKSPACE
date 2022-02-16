package com.janbask.methodOverriding;

public class A {
	
	
	public void method1() {
		
		System.out.println("calling parent method 1");
	}
	
	public void method2() {
		
		System.out.println("calling parent method 2");
	}

	public static void main(String[] args) {
		
		A a= new A();
		a.method1();
		

	}

}
