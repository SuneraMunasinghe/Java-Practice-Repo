package com.suneramocktest;

public class Passport extends Card {
	
	private String birthLocation;
	private int expirationYear;
	
	public Passport(String name, String birthLocation, int expirationYear) {
		super(name);
		this.birthLocation = birthLocation;
		this.expirationYear = expirationYear;
	}
	
	@Override
	public boolean isExpired() {
		return false;
	}
	
}
