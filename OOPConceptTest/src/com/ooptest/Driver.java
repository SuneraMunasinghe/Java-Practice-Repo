package com.ooptest;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog("Max", 7, "Labrador");
		Cat cat = new Cat("Puma", 4, "Orange");
		
		dog.setName("Dexter");
		cat.setName("Leo");
		
		System.out.println("Dog name: " + dog.getName());
		System.out.println("Cat Name: " + cat.getName());
		
		dog.makeSound();
		cat.makeSound();
		
		System.out.println(cat);
		System.out.println(dog);	//Useless memory location output bcs no toString method in dog class.

		
	}	//End main method

}
