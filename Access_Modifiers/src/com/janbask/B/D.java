package com.janbask.B;

import com.janbask.A.Protected_Example;

public class D extends Protected_Example
{
	public static void main(String[] args) {
		
		/*
		 * Protected_Example pe= new Protected_Example(); pe.method1();
		 * System.out.println(pe.age); System.out.println(pe.name);
		 */
		
		D d = new D();
		d.method1();
		System.out.println(d.age);
		System.out.println(d.name);
	}

}
