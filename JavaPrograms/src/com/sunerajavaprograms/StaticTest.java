package com.sunerajavaprograms;

//Class to test out the static variable.
public class StaticTest {
	
	static int age = 24;	
	
	public final int printAge() {
		return age;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String add(String first, String second) {
		return first+second;
	}
	
	public String toString() {
		return "Age is " + age;
	}
	
	
	
	//Using all modifiers and access levels
//	public static final int displayAge() {
//		return age;
//	}
//	
}
