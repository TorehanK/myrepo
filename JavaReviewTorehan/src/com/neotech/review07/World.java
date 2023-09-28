package com.neotech.review07;

public class World {
	
	public static void main(String[] args) {
		
		
		
		//1st way, using constructor with NO parameters
		Person p1 = new Person();
		p1.displayInfo();
		
		p1.name = "Yasemin";
		p1.age = 20;
		p1.weight = 120;
		
		p1.displayInfo();
		
		System.out.println("---------");
		
		//2nd way, using the constructor with 2 parameters
		Person p2 = new Person("Ermal",40);
		p2.displayInfo();
		p2.weight = 250;
		p2.displayInfo();
		
		Person p3 = new Person("Ahmet", 25, 170);
		p3.displayInfo();
		
		
		
		
		
		
	}

}
