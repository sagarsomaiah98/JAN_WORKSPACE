package com.janbask.methodOverriding;

public class B extends A {
	
	//implementation of parent method is modified in child class
	public void method1() {
		
		
		System.out.println("modifying the method1 in child");
	}
	
	
	public void childmethod() {
		
		
		System.out.println("child method");
	}

	public static void main(String[] args) {
		
		B b= new B();
		b.method1();
		b.method2();
		b.childmethod();
		
	}

}
