package com.janbask.ArrayExamples;

public class Array_contains_userDefined {
	
	
	public void array_contains() {
		
		String[] stud= {"marks","steve","jenny","kevin"};
         String name="kevin";
		for(int i=0;i<4;i++) {
			
			if(name.equals(stud[i]))
				
			
			System.out.println("found");
			else
				System.out.println("not found");
		}
		
	}

	public static void main(String[] args) {
		
		Array_contains_userDefined u = new Array_contains_userDefined();
		u.array_contains();
		
		

	}

}
