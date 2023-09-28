package com.neotech.review04;

public class Baby {
	// Variables,Attributes,Properties
	String name;
	char gender;
	int weight;
	String hairColor;
	
	//Methods,Behaviors,Actions
	void talk() {
		System.out.println(name + " is talking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void cry() {
		System.out.println(name + " is crying");
	}
	void displayInformation() {
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My hair color is " + hairColor);
	}
	
	

}
