package com.janbask.methodOverRiding;
public class Grand_Child extends Child {

	
	// Method Overriding - establish is a relationship / inheritance
	// method name and argument should be same in different class
	
	//Difference between method overloading and overriding
	
	public void method4() {
		
		System.out.println(" override method in grand child");
	}
	
	
	public void method1() {
		
		System.out.println("override in grand child");
	}
	
public void method5() {
		
		System.out.println("method in grand child");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grand_Child g= new Grand_Child();
		g.method5();
		g.method1();
		g.method2();
		g.method3();
		g.method4();

	}

}
