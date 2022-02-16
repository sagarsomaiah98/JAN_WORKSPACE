package com.janbask.inheritance;

public class Parent  {
	
	String lname="Xavier";
	char grade='C';
	
	
	public void factory() {
		
		
		System.out.println("Parents Factory");
	}
	
	
	public void house() {
		
		System.out.println("Parents house");
	}
	

	public static void main(String[] args) {
		
		Parent p= new Parent();
		p.factory();
		p.house();
		System.out.println(p.lname);
		System.out.println(p.grade);
	;
		
	}

}
