package com.ooptest;

public class Cat extends Animal{
	
	String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println("MEOW!");
	}
	
	//toString method to print out meaningful output when an object is printed, instead of printing a memory location.
	public String toString() {
		return "Cat age is " + getAge();
	}
	
}
