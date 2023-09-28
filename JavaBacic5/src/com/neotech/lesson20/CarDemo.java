package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {
		// how do we create and initialize an object
		Car c = new Car();
		c.make = "Toyota";
		c.model = "Camry";
		c.year = 2020;

		c.printDetails();

		// with parametrized constructor
		Car c2 = new Car("BMW", "M5", 2021);
		c2.printDetails();

		// if i create an object with parameters, default constructor will
		// be omitted
		Car c3 = new Car("Honda", "Accord", 2022);
	}

}
