package com.neotech.review08_Abstraction;



// Abstract - Soyut (In turkish)
public abstract class Human {
	
	String name;
	static String planet;
	
	public Human(String name) {
		this.name = name;
	}

	public abstract void talk(); //unimplemented method(No body)
	
	public void sleep() {
		//Implemented method(Has a method body) --> {}
		System.out.println("Every human sleeps the same.");
	}
}
