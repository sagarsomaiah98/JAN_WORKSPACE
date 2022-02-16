package com.janbask.variables;

public class Employee {
	
	//global variable
	String name="Kevin";
	int age=35;
	double height=3.7;
	char grade='K';
	
	

	public static void main(String[] args)
	
	
	{
		
		//classname object= new classname();
		
		Employee a=new Employee();// create a object
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		System.out.println(a.height);
		System.out.println(a.grade);
		
		
		

	}

}
