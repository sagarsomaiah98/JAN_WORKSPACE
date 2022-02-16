package com.janbask.methodOverloading;

public class Add {
	
//Method overloading- you can have same method name but different arguments
	
	public void addition(int a, int b) {
		
		int c=a+b;
		
		System.out.println("Addition of two numbers is "+a+" & "+b+" is "+c);
		
		
	}
	
	public void addition(int a, int b,int c) //parameters or arguments
	{
		
int d=a+b+c;
		
		System.out.println("Addition of thre numbers is "+a+" & "+b+" & "+c+"  is "+d);
		
	}

	public static void main(String[] args) 
	{
	Add a= new Add();
	a.addition(5, 10);
		
		
	}

}
