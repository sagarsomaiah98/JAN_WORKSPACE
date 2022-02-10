package com.janbask.methodOverloading;

public class Poly {
	
	
	//Method overloading- Polymorphism - same method name but different arguments/ parameters
	
	// same object different behavior
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		
		System.out.println(a+" "+b+" "+c );
		
		
	}
	
	
public void add(int a, int b, String val) {
		
		System.out.println(a+" "+b+" "+val);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Poly p= new Poly();
		

	}

}
