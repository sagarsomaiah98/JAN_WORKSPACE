package com.janbask.variables;

public class Car {
	
	int model=2000;
	String color="Red";
	double mileage=12.5;
	
	String windows="automatic";
	
	

	public static void main(String[] args) {
		
		
		// classname object = new classname();
		
		Car a=new Car();
		
		System.out.println(a.model);
		System.out.println(a.color);
		System.out.println(a.mileage);
		
		System.out.println(a.windows);
		
		
	}

}
