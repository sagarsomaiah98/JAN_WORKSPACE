package com.janbask.inheritanceExample;

public class Child extends Parent{
	
	
	public void car() {
		
		System.out.println(" child owns a car");
	}

public void factory() {
		
		System.out.println(" child owns a factory");
	}

	public static void main(String[] args) {
		
	
		
		System.out.println("**********************************");
		
		
		Child c= new Child();
		c.car();
		c.factory();
		c.bike();
		c.house();
		
		
		
	}

}
