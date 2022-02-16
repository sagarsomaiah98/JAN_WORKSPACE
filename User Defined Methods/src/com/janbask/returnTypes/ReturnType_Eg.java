package com.janbask.returnTypes;

public class ReturnType_Eg {
	
	public int test() 
	{
	int age=30;
	
		return age; //returning integer value
		
	}

	public static void main(String[] args) {
		
		
		ReturnType_Eg r = new ReturnType_Eg();
		r.test();//output of age i.e 30
		
	//	System.out.println(r.test());
		
		int value=r.test()*10;
		
		System.out.println(value);
		
		if(r.test()>60)//30>60
			System.out.println("senior citizen");
		else
			
			System.out.println("not senior citizen");
		

	}

}
