package com.janbask.staticExamples;

public class Test {

	public static void main(String[] args) {
		/*
		 * Employee e = new Employee(); System.out.println(e.age);
		 * System.out.println(e.name); System.out.println(e.Designation);
		 * System.out.println(e.height);
		 */
		
		//static keyword can access variables and method without creating a object, if you are calling static variables or methods
		//in same class no need create a object if you are calling it in another class , you need to call along with class names
		System.out.println(Employee.age);
		System.out.println(Employee.name);
        System.out.println(Employee.Designation);
        System.out.println(Employee.height);
        Employee.test1();
		
	}

}
