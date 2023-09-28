package com.neotech.lesson22;

public class CalculateArea {

//	1- Create a class named CalculateArea in which you should create three methods 
//	(with the same name) that will calculate the area (volume) of
//	➔ Rectangle --> side1 and side2
//	➔ Square  ---> side
//	➔ Box ---> width, height, length
//	Use a separate class to test your code.
	
	
	static void area(int side1, int side2)
	{
		System.out.println("The area of the rectangle is: " + side1*side2);
	}
	
	static void area(int side)
	{
		System.out.println("The area of the square is: " + side * side);
	}
	
	static void area(int length, int width, int height)
	{
		//area of the box
		//2*length*width + 2*length*height + 2*width*height
		System.out.println("The area of a box is: " + length * height * width);
	}
	
	
	
}
