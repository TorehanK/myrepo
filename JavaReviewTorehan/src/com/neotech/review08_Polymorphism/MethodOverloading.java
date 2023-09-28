package com.neotech.review08_Polymorphism;

public class MethodOverloading {

	// Method signature = method name + parameters
	// Acces modifier is NOT part of Method signature
	// Return type is NOT part of Method signature

	public void methodOne() { // { } ---> body, implemented

	}

	public void methodOne(int a) {

	}

	public void methodOne(String a) {

	}

	public void methodOne(int a, int b) {

	}

	public void methodOne(double a, double b) {

	}

	public void methodOne(double a, int b) {

	}

	public void methodOne(int a, double b) {

	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();

		mo.methodOne("Merve");

		mo.methodOne(5.5, 6);
		// Polymorphism --> method overloading, having same method name but number of 
		// parameters are different
		// Compile time Polymorphism / Early binding / Static binding 
	}
}
