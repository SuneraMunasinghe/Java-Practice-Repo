package com.suneramocktest;

public class CreditCard extends Card {
	
	private int pinNumber;
	private int expirationYear;
	
	public CreditCard (String name, int pinNumber, int expirationYear) {
		super(name);
		this.pinNumber = pinNumber;
		this.expirationYear = expirationYear;
	}
	
	@Override
	public boolean isExpired() {
		return false;
	}
	
	public String toString() {
		return "CardHolder Name: " + getName() + "\n" + "Pin Number: " + pinNumber
				+ "\n" + "Expiration Year: " + expirationYear + "\n";
	}
	
}
