package com.neotech.lesson14;

public class Dog {
	
	String breed;
	double size;
	String color;
	int age;

	
	void eat()
	{
		System.out.println(breed + " eats carrots!");
	}
	void run()
	{
		System.out.println(breed + " runs fast");
	}
	void breed()
	{
		System.out.println(breed + " is the color " + color);
	}
}
