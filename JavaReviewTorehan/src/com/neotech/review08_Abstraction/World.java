package com.neotech.review08_Abstraction;

public class World {
	public static void main(String[] args) {
		//I cannot create an object from an abstract class
//		Human h1 = new Human("Olga");
		
		
		//up-casting and down-casting 
		//can only be done because of Inheritance
		Human a1 = new Albanian("Alban"); //up-casting -----> both not abstract classes so we can do it
		a1.talk();
		a1.sleep();
//		a1.albnianDance(); ---> we said human a1 new albanian, a1 is human
		
		Human t1 = new Turkish("Mesut"); //Up-casting
		t1.talk();
		t1.sleep();
//		t1.makeBaklava(); ----> not declared in human class. we did human t1 new turkish
		
		Turkish tur = (Turkish) t1; //down casting
		tur.makeBaklava();
		
		Human h1 = new Albanian("Hava");
		Human h2 = new Turkish("Tore");
		Human h3 = new Turkish("Mehmet");
		Human h4 = new Turkish("Ahmet");
		Human h5 = new Turkish("Kemal");

		Human[] hum = {h1,h2,h3,h4,h5};
		for(Human h : hum) {
			h.sleep();
			h.talk();
		}
		
	}
}
