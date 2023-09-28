package com.neotech.lesson26;

public class Square implements Shape {

	@Override
	public void calculateArea(int r) {
		System.out.println("The area of the square is " + r*r);
	}

	@Override
	public void calculatePerimeter(int r) {
		System.out.println("The Perimeter of the square is " + 4*r);
	}

}
