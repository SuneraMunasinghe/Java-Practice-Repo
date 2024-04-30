package com.interviews.prep;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
