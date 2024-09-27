package com.ooptest;

public class OSFactory {
	
	public OS getInstance(String choice) {
			if (choice.equals("A")) {
				return new Android();
			} else if (choice.equals("I")) {
				return new IOS();
			} else {
				return new Windows();
			}
		
	}
	
	
	
}
