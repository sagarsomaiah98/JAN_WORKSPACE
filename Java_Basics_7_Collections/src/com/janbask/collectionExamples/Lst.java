package com.janbask.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class Lst {

	public static void main(String[] args) {
	
		//Syntax
		
		//List - Interface         //Class  
		List<String> Students= new ArrayList<String>();
		
		Students.add("Jake"); //0
		
		Students.add("max"); //1
		Students.add("Hayes");//2
		
		Students.add("Peter");// 3
		Students.add("James"); //4
		
		Students.add("max"); //5
		int size= Students.size();
		
		//System.out.println(" size of students list = "+  size);
		
		//System.out.println(Students.get(5));
		
		
		for( int i=0;i<size;i++) {
			
			
			System.out.println(Students.get(i));
			
			/*
			 * if(Students.get(i)=="max") break;
			 */
		}
		
		
		
		
		

	}

}
