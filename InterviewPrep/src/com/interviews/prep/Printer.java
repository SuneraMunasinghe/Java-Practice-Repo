package com.interviews.prep;

public class Printer <T> {
	
	T thingToPrint;
	
	public Printer(T thingtoPrint) {
		this.thingToPrint = thingtoPrint;
	}
	
	public void Print() {
		System.out.println(thingToPrint);
	}
	
}
