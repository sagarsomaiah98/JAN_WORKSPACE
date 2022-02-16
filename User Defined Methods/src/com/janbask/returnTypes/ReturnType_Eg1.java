package com.janbask.returnTypes;

public class ReturnType_Eg1 {
	
	
	public int test1() // void, int, string, char,boolean,double,float
	{
		int a=10;
		double b=2.3;
		String name="john";
		char c='A';
		
		boolean flag=true;
		
	return a;			//return value or variable
		
	}
	
	public int  rectangle_area(int l, int b) 
	{
		int res=l*b;
		
		return res;
		
		
		
		
	}

	public int max(int a, int b) 
	{
	if(a>b)
		return a;
	else
		return b;
		
		
	}
	
	public static void main(String[] args) {
		
  ReturnType_Eg1 r = new ReturnType_Eg1();
  
     // System.out.println(r.test1());
  
 // r.rectangle_area(20, 30);  //60
  
  ///System.out.println("Area of rectangles is "+r.rectangle_area(20, 30));
  System.out.println(r.max(30, 40));
  
  
	}

}
