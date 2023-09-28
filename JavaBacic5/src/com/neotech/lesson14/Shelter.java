package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		
		d1.breed = "Labrador";
		d1.size = 5.9;
		d1.age = 10;
		d1.color = "black";
		
		d1.eat();
		d1.run();
		d1.breed();
		
		Dog d2 = new Dog();
		d2.breed = "Chow Chow";
		d2.size = 4.5;
		d2.age = 3;
		d2.color = "white";
				
		d2.eat();
		d2.run();
		d2.breed();
				
	}

}
