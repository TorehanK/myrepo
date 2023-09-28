package com.neotech.lesson14;

public class Car {

	// What Features Does a Car Have?
		// make, model, color, year, mileage, maxSpeed
	
	// What behaviors does a car have?
		//drive(), stop(), transportPeople()
	
	String make; 
	String model;
	String color;
	int year;
	int milage;
	int maxSpeed;
	
	//How do we code behaviours??(Methods)
	
	//What is a method:
		// Think of it as a factory
		//------INPUT------> {  METHOD  }  ------> OUTPUT
	
	//return type      method name ()
	//{
	//    ... code goes here
	//}
	
	
	//void --> method will not return anything
	//int --> method will return an int
	void drive()
	{
		System.out.println(make + " " + model + " drives!");
	}
	void stop()
	{
		System.out.println(make + " stops!");
	}
	void transportPeople()
	{
		System.out.println(make + " can transport people!");
	}
	
	
	//What is a class?
		//Class is a Blueprint/Template/Structure
		//It has -features and -behaviours
	//What is an object?
		//an object is  an instance/example of a class
		//when we initialize a class
	
	String str = "I love java!";      //Object --- same as --- String str = new String ("I love java!");
	String str2 = "I also love Python!";  //Object
	
	public static void main(String[] args) {
		int a = 5;// this lives inside the curly brackets of the method
		int b;
		//everything inside will stay
		
		//how do we create an object with our blueprint/template?
		// data type      identifier       operator      New keyword     data type
		//ClassName        identifier    operator         New Keyword      ClassName
		
		
		Car car1 = new Car(); //Basically initializes the parameters written up from here (etc. make,model..)
		//what does this line do?
		//1st-- it declares an object of class "Car"
		//2nd-- instantiation(new)
		//3rd-- Car() -- initialization 
		
	    //if you debug, you will see that the object is created with default values (car1)
		
		//how we access elements (features and behaviors) of the car class??
		
		car1.make = "Toyota";
		car1.model = "Camrey";
		car1.color = "Red";
		car1.year = 2019;
		car1.milage = 25000;
		car1.maxSpeed = 140;
		
		System.out.println(car1.make + " " + car1.model + " " + car1.year);
		
		//Car car2 = new Car();
		//Car car3 = new Car();
		//Car car4 = new Car();
		//Car car5 = new Car();
		
		//how do I access the methods??
		car1.drive();
		car1.stop();
		car1.transportPeople();
		
	}
	
	
	
	
	
}
