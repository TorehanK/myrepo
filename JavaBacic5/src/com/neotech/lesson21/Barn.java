package com.neotech.lesson21;

public class Barn {
	
	public static void main(String[] args) {
	Animal a = new Animal();
	a.name = "DayDay";
	a.color = "Brown";
	a.age = 5;
	
	a.sleep();
	a.eat();
	a.displayInfo();
	
	System.out.println("-------------");
	
	Dog d = new Dog();
	d.name = "Nice"; //coming from Animal class
	d.age = 2; //coming from Animal class
	d.color = "White"; //coming from Animal class
	d.breed = "Husky"; //coming from Dog class
	
	d.eat(); //coming from Animal class
	d.sleep(); //coming from Animal class
	d.displayInfo(); //coming from Animal class
	d.bark(); //coming from Dog class
	
	System.out.println("----------");
	Cat c = new Cat();
	c.name = "Luckey";
	c.age = 2;
	c.color = "Orange";
	c.weight = 15;
	
	c.eat();
	c.sleep();
	c.displayInfo();
	c.meow();

	System.out.println("-----------");
	Puppy p = new Puppy();
	p.name = "Tiny"; //coming from Animal class
	p.age = 1;//coming from Animal class
	p.breed = "Pug"; //coming from Dog class
	p.hasPottyTraining = false; //coming from Puppy class
	
	
	
	
	
	}
}
