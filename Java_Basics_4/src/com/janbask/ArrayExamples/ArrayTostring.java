package com.janbask.ArrayExamples;

import java.util.Arrays;

public class ArrayTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stud= {"marks","steve","jenny","kevin"};
		
		System.out.println("Length of array stud is   "+stud.length);
		
		
		
		String student= Arrays.toString(stud);
		System.out.println(student);

	}

}
