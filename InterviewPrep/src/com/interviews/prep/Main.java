package com.interviews.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		/*Method Overloading polymorphism.
		Method executes according to the type of input provided*/
		
		//Calculator class instance
		Calculator calcObj = new Calculator();
		
//		int sum1 = calcObj.add(25, 10);
//		int sum2 = calcObj.add(25, 10, 50);
//		double sum3 = calcObj.add(2.5, 6.25);
//		String sum4 = calcObj.add("Hello ", "world");
//		
//		System.out.println(sum1);
//		System.out.println(sum2);
//		System.out.println(sum3);
//		System.out.println(sum4);
		
		//Polymorphism End.
		//Constructors Person Example
		
//		Person personObj = new Person("Sunera", 23, "Male");
//		
//		System.out.println("Name: " + personObj.getName());
//		System.out.println("Age: " + personObj.getAge());
//		System.out.println("Gender: " + personObj.getGender());
		
		//Constructors Example End
		//Overriding example start
		
//		Circle circleObj = new Circle(3.0);
//		Rectangle rectangleObj = new Rectangle(5.0, 4.0);
//		
//		System.out.println("Area of Circle: " + circleObj.calculateArea());
//		System.out.println("Area of Rectangle: " + rectangleObj.calculateArea());
		
		//End overriding example
		//Abstract classes
		
//		Cat catObj = new Cat();
//		
//		catObj.makeNoise();
		
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		
//		dog.makeSound();
//		cat.makeSound();
		
		//End Abstract methods
		//Arraylists Start.
		
//		String[] friendsArray = {"Sunera", "John", "Eric", "Adam"};
//		
//		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Sunera", "Mark", "Khan", "Paul"));
//		
//		System.out.println(friendsArray[1]);
//		System.out.println(friendsArrayList.get(1));
//		
//		System.out.println(friendsArray.length);
//		System.out.println(friendsArrayList.size());
//		
//		friendsArrayList.add("Mitch");
//		
//		System.out.println(friendsArrayList.get(4));
//		
//		friendsArrayList.set(0, "Carl");
//		System.out.println(friendsArrayList.get(0));
//		
//		System.out.println(friendsArrayList);
//		
//		ArrayList<String> exampleArrayList = new ArrayList<>();
		
		//End ArrayLists.
		//Java generics
		
//		Printer<Integer> printer = new Printer<>(345);
//		
//		printer.Print ();
		
		//End Java Generics
		//Start Hashmaps.
		
		HashMap<String, Integer> empId = new HashMap<>();
		
		empId.put("Carl", 345);
		empId.put("John", 951);
		empId.put("Rat", 752);
		
		System.out.println(empId);
		System.out.println(empId.get("John"));
		System.out.println(empId.containsKey("Rat"));

		
	}	//MAIN METHOD END

}
