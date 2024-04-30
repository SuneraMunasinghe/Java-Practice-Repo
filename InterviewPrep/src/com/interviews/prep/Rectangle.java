package com.interviews.prep;

public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length * width;
	}

}
