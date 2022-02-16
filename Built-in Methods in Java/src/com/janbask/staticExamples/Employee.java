package com.janbask.staticExamples;

public class Employee {
	
	static int age=40;
	static String name="Henry";
	static char Designation='A';
	static double height=5.9;
	
	public static void test1() {
		
		System.out.println("calling test1");
	}

	public static void main(String[] args) 
	
	{
		/*
		 * Employee e = new Employee(); System.out.println(e.age);
		 * System.out.println(e.name); System.out.println(e.Designation);
		 * System.out.println(e.height);
		 */
		System.out.println(age);
		System.out.println(name);
        System.out.println(Designation);
        System.out.println(height);
        test1();

	}

}
