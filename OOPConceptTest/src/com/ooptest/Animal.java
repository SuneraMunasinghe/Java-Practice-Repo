package com.ooptest;

public abstract class Animal {
	private String name;
	private int age;
	
	//Constructor
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getters and setters
	public void setName(String x) {
		name = x;
	}
	
	public void setage(int x) {
		age = x;
	} 
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Abstract method
	public abstract void makeSound();
	
}
