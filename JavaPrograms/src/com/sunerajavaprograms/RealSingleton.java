package com.sunerajavaprograms;

//Singleton class
public class RealSingleton {
	
	private int count = 0;	//Random variable to test singleton nature.
	
	//Create a static instance of a class.
	static RealSingleton obj = new RealSingleton();
	
	//Restrict usage of the default constructor.
	private RealSingleton () {
		
	}
	
	//Create a method to call the instance.
	static public RealSingleton getInstance() {
		return obj;
	}
	
	//---Random method to test object creation below here!---
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
}




