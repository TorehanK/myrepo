package com.neotech.lesson22;

public class A {
//	Homework 1:
//	    Write program for multilevel inheritance where class A is inherited by B and class B is inherited by class by C.
//
//	Homework 2:
//	    Write a Java program called Car. Specify features and behaviours of the Car class.
//	    Create SportsCar and FamilyCar subclasses of the Car class with their own features and behaviours.
//	    Next, create a LuxurySportsCar that will inherit the SportsCar and also will have its own features and behaviours.
//	    Create objects from each class and test them.
	
	String name = "A";
	void method() {
		System.out.println("This is a method in class A");
		System.out.println(name);
	}
	
	class B extends A
	{
		String name = "B";
		void method() {
			System.out.println("This is a method in class B");
			System.out.println(this.name);
			System.out.println(super.name);
			super.method();
		}
	}

	class C extends B
	{
		
	}
}
