package com.janbask.inheritance;

public class Child extends Parent {
	
	//global variables or class variable
      int age=21;
      double salary=100.56;
	
	public void car() {
		
		System.out.println("Childs car");
	}
	
	
	
	public static void main(String[] args)
	
	{
		Child c= new Child();
		c.car();
		System.out.println(c.age);
		System.out.println(c.salary);
		
		c.house();
		c.factory();
		
		System.out.println(c.grade);
		System.out.println(c.lname);
		
	}

}
