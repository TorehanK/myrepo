package com.neotech.review08_Polymorphism;

public class World {
	public static void main(String[] args) {

		Human.planet = "Earth"; // static

		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Burhan");
		System.out.println(h2.name + " lives in " + Human.planet);

		Human.planet = "Mars"; // all humans will live in the new planet- we are sending everyone to mars:)

		System.out.println("------------------------");

		System.out.println(h2.name + " lives in " + Human.planet);

		// Declaring a variable of type human
		Human h3;
		// Creating an Albanian and assgning to h3
		h3 = (Human) new Albanian("Ermal"); // Up-casting ------ (Human) no need in this line, java does it itself

		System.out.println(h3.name + " lives in " + Human.planet);

		Human h4 = (Human) new Turkish("Elif"); // Up-casting, automatically --- (Human) not needed, does it
												// automatically
		System.out.println("Let us make the people talk, by giving money");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();
		
		//Polymorphism
		//Method overloading
		//Run-time Polymorphism/late binding/Dynamic binding

		// compile error, Because h4 is type human
//	h4.makeBaklava();

		System.out.println("----------------------------");
		Turkish t1 = (Turkish) h4; // Down-casting--manually(Like primitives)
		t1.makeBaklava();

		// This will give a runtime error
//	Turkish t2 = (Turkish) h3;
//	t2.makeBaklava();

		System.out.println("-------------------");
		
		//This is a safe way to Down-cast!
		if(h3 instanceof Albanian) {
			//Can cast/convert into Albanian
			Albanian alb = (Albanian) h3;
			alb.albanianDance();
		}else if(h3 instanceof Turkish) {
			//Can cast/convert into Turkish
			Turkish tur = (Turkish) h3;
			tur.makeBaklava();
		}
		System.out.println("-----------------");
		
		American us1 = new American("Donald", "245-65-0986");
		us1.talk();
		//us1.taxRetuen();
		
		Human h5 = us1; //Up-Casting, implicitly
		h5.talk();
		
		//h5.taxReturn();
		
		American us2 = (American) h5; //Down-Casting, explicitly
		us2.taxReturn();
		System.out.println("------Power of Polymorphism------------");
		
		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2; //Human
		humans[2] = h3; //Albanian
		humans[3] = h4; //Turkish
		humans[4] = h5; //American
		humans[5] = new American("Barrack", "Secret");
		//This one is possible becuase of inheritance
		
		for(Human element : humans) {
			element.talk();
		}
		
	}
}