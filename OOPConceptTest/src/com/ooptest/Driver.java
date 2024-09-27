package com.ooptest;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//		Dog dog = new Dog("Max", 7, "Labrador");
//		Cat cat = new Cat("Puma", 4, "Orange");
//		
//		dog.setName("Dexter");
//		cat.setName("Leo");
//		
//		System.out.println("Dog name: " + dog.getName());
//		System.out.println("Cat Name: " + cat.getName());
//		
//		dog.makeSound();
//		cat.makeSound();
//		
//		System.out.println(cat);
//		System.out.println(dog);	//Useless memory location output bcs no toString method in dog class.
		
		//Test Main class for factory method.
//		OS obj1 = new Windows();
//		OS obj2 = new Android();
//		obj1.specs();
//		obj2.specs();
		
		OSFactory osf = new OSFactory();
		OS osObj = osf.getInstance("A");
		
		osObj.specs();


		
	}	//End main method

}
