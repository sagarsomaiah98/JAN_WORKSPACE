package com.janbask.constructorExamples;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
            int a = 30;
            int b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(Exception e) {
        	
        	e.printStackTrace();
            System.out.println ("Can't divide a number by 0");
        }

	}

}
