package com.neotech.review07;

public class Person {
	//instance variables(all will have these properties-name,age,weight)
	
	//public means only in whole review class
			//protected means seen only in same package
			//private means only seen in same class
	public String name;
	int age;
	protected int weight;
	
	public Person() {
		System.out.println("Creating a person with NO information!");
	}
	
	public Person(String pName, int pAge) {
		name = pName; //instance variable changed
		age = pAge;
	}
	
	public Person(String n, int a, int w) {
//		name = n;
//		age = a;
//		weight = w;
		this(n,a);  //this means calling a method above which already set the name and age
		weight= w;
		
		//this(); ---> method with no constructor will be executed
		
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + 
				" weight: " + weight);
		
	}
	

}
