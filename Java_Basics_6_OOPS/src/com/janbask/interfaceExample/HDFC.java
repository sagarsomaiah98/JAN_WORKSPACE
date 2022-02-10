package com.janbask.interfaceExample;
public class HDFC implements Bank{
	
	
	

	public static void main(String[] args) {
		HDFC h= new HDFC();
		h.savings_account();
		
		h.loan();

	}


	public void savings_account() {
		System.out.println(" saving account - 30k bal");
		
	}




	
	public void loan() {// TODO Auto-generated method stub
		
		System.out.println(" home loan - 4.5%");
		
	}


	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		
	}
	
	public void personal_loan()
	{
		
		System.out.println(" loan interest 2%");
	}

}
