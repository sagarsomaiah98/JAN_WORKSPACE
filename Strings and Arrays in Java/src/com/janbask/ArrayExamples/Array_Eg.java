package com.janbask.ArrayExamples;

public class Array_Eg {

	public static void main(String[] args) {
		
		String[] color= new String[5];
		
		color[3]="Red";
		
		color[3]="blue";
		color[2]="green";
		color[0]="orange";
		color[1]="yellow";
		color[4]="black";
		
		/*
		 * System.out.println(color[0]); System.out.println(color[1]);
		 * System.out.println(color[2]); System.out.println(color[3]);
		 * System.out.println(color[4]);
		 */
		
		//System.out.println(color.length);
		
		for(int i=0;i<color.length;i++)
		{
			
			System.out.println(color[i]);
		}

	}

}
