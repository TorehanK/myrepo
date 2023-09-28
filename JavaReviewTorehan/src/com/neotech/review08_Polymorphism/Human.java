package com.neotech.review08_Polymorphism;

//Evry class by default extends the object class
//we can write extends MethodOverloading but no need
public class Human {
	// Fields / Variables / Properties
	String name; // every human has a name ---->Instance variable
	static String planet; // all humans have the same planet, thats why static,same----> class,static
							// variable

	public Human() {
		// super(); ---> this is being done even if we dont see it
		System.out.println("A human is being created!");
	}

	public Human(String name) {
		// this(); ---> calls the one above, prints a human is being created then goes
		// down to this.name
		this.name = name;
	}

	// behavior/method
	public void talk() {
		System.out.println("bla bla bla");
	}
}
