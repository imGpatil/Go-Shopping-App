package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	private static final float charges = 0;
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges, isPrime);
	}

	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
	


}
