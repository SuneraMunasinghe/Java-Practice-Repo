package com.interviews.prep;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	//Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Getter methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
}
