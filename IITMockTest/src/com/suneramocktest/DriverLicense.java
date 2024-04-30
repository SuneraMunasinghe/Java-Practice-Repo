package com.suneramocktest;

public class DriverLicense extends Card {

	private int expirationYear;
	
	public DriverLicense(String name, int expirationYear) {
		super(name);
		this.expirationYear = expirationYear;
	}
	
	@Override
	public boolean isExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
