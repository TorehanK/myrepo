package com.neotech.lesson15;

public class Dog {
	
	String breed;
	int age;
	double height;
	
	void happy() {
		System.out.println(breed + " is happy");
	}
	void info() {
		System.out.println(breed + " is " + age + " years old and its height is " + height);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.breed = "Labrador";
		dog1.age = 11;
		dog1.height = 3.4;
		
		dog2.breed = "Husky";
		dog2.age = 20;
		dog2.height = 3.5;
		
		dog3.breed = "Pitbull";
		dog3.age = 10;
		dog3.height = 5.4;
		
		dog1.happy();
		dog2.happy();
		dog3.happy();
		System.out.println("------------------------");
		dog1.info();
		dog2.info();
		dog3.info();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





