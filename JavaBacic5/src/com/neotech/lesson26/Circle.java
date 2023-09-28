package com.neotech.lesson26;

public class Circle implements Shape{

	@Override
	public void calculateArea(int r) {
		System.out.println("The are of the Circle is " + 3*r*r);
	}

	@Override
	public void calculatePerimeter(int r) {
		System.out.println("The perimeter of the Circle is " + 2*3*r);
	}

}
