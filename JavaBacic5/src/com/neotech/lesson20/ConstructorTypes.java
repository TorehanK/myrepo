package com.neotech.lesson20;



public class ConstructorTypes {

	String name;
	int age;
	
	
	//default constructor
	//no return type - not even void
	//same as the class name
	//no parameters
	
	ConstructorTypes(){
		System.out.println("I am a non-argument constructor!");
	}
	//we can have parameters in constructor
	//signiture: (String)
	ConstructorTypes(String str){
		System.out.println("I am a constructor with a string! " + str);
	}
	
	//signiture: (int)
	ConstructorTypes(int num){
		System.out.println("I am a constructor with an int: " + num);
	}
	
	//signiture: (double)
		ConstructorTypes(double num){
			System.out.println("I am a constructor with a double: " + num);
		}
		
		//signiture: (String, int)
		ConstructorTypes(String str, int num){
			System.out.println("I am a constructor with a string: " + str + " and age: " + num);
		}
		
		//signiture: (String, String)
				ConstructorTypes(String str, String str2){
					System.out.println("I am a constructor with a string: " + str + " and another string: " + str2);
				}
	
	public static void main(String[] args) {
		
		//using the default constructor
		
		ConstructorTypes ct = new ConstructorTypes();
		System.out.println(ct.name + " " + ct.age);
		
		ConstructorTypes ct1 = new ConstructorTypes("Ogulcan");
		
		ConstructorTypes ct2 = new ConstructorTypes("Olga",25);

		//ConstructorTypes ct3 = new ConstructorTypes("Alp", "Zeynep", "Huseyin");
		//java will complain cause there is no constructor method with signiture --> 3 Strings
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
