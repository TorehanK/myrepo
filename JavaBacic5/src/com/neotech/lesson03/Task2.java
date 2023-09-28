package com.neotech.lesson03;

public class Task2 {

//	Write a program to print the area and perimeter of a rectangle with 
//	width = 5 and height = 8. Your program should say. “The perimeter of a 
//	rectangle with width ___ and height ____ is equal to _____ and the area is __”

	public static void main(String[] args) {

		// declaring variables
		int w, h, p, a;

		// initialize -> giving intial values
		w = 5;
		h = 8;

		p = 2 * (w + h); // assign after calculation
		a = w * h;
		
		System.out.println("The perimeter of a rectangle with width " + w 
				+ " and height " + h + " is equal to " +
				p + " and the area is " + a);

	}

}
