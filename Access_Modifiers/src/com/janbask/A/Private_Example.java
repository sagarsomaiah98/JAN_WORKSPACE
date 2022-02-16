package com.janbask.A;

public class Private_Example {
	private int age=23;
	private String name="Andrew";
	
	private void method1() {
		
		System.out.println("method 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Private_Example p = new Private_Example();
		p.method1();
		System.out.println(p.age);
		System.out.println(p.name);

	}

}
