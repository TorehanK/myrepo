package com.neotech.review07;

//OOP--> Object Oriented Programming
//1. Inheritance (object extending to another object)
//2. Polymorphism(Method overloading)
//3. Abstruction
//4. Encapsulation

//Every class in Java is extending the object
//Object class is like Adam in humanity:)
public class Doctor extends Object {  // ---> no need to write extends Object
	
	
	String name;
	int salary;
	String licenceId;
	
	//It is a good practice to leave the default constructor
	Doctor(){
		
	}
	
	Doctor(String name, int salary, String licenceId){
		this.name = name;
		this.salary = salary; // to distinguish the parameter and salary
		
	}
	
	public void checkUp(String name) {
		System.out.println("Doctor: " + this.name + " makes a check up on " + name); //this.name --> name of the doctor
	}
	
}
