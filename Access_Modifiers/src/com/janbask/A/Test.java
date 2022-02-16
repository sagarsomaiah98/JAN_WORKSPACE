package com.janbask.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Private_Example p = new Private_Example();
		 * 
		 * p.method1(); System.out.println(p.age); System.out.println(p.name);
		 */
		
		/*
		 * Default_Example d = new Default_Example(); d.method1();
		 * System.out.println(d.age); System.out.println(d.name);
		 */
		
		Protected_Example pe= new Protected_Example();
		pe.method1();
		System.out.println(pe.age);
		System.out.println(pe.name);

	}

}
