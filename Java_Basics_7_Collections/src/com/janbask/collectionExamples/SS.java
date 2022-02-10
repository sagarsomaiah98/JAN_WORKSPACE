package com.janbask.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class SS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> colors=new HashSet<String>();// Syntax
		
		
		colors.add(" red");
		colors.add(" yellow");
		colors.add(" green");
		colors.add(" red");
		colors.add(" yellow");
		colors.add(" orange");
		
		int size= colors.size();
		
		//System.out.println(" size of colors set == "+size );
		
		
		Iterator it = colors.iterator(); // virtual pointer
		
		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next()); System.out.println(it.next());
		 */
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		
		
		while(it.hasNext()) { // untill condition is true, once condition is false it will exist loop
			
			System.out.println(it.next());
		}
		
		
	
		
		
		
		

	}

}
