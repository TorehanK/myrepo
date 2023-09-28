package com.neotech.lesson21;

public class Animal {
	//Some properties
	String name, color, breed;
	int age, weight;
	
	//Some behaviors (actions,methods,functions)
	public void eat() {
		System.out.println("All animals eat");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	// A common method
	public void displayInfo()  {
		System.out.println("name: " + name + " color: " + color + " age: " + age + " weight: " + weight);
	}
	
	
	
	
	
	
	
}
