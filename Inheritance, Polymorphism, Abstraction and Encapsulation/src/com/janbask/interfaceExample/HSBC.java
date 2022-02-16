package com.janbask.interfaceExample;

public class HSBC implements CentralBank {
	


	@Override
	public void savings() {
		System.out.println("savings in hsbc is 25000");
		
	}

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		
		System.out.println("home loan interest in hsbc is 4%");
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("hsbc credit card charges is 100");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("hsbc insurance is 50");
	}

	public static void main(String[] args) {
		
		HSBC h = new HSBC();
		h.homeloan();
		h.insurance();
		h.savings();
		h.creditcard();

	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}
}
