package com.neotech.review07;



public class HospitalApplication {
	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("Olga",310000,"RU123");
		
		d1.checkUp("Abril");
		
		//These are variables and methods of child class 
//		d1.dermID();  not a dermatologist
//		d1.applySkinTreatment();7
		
		//Creating a Dermatologist with NO initial information
		Dermatologist d2 = new Dermatologist();
		d2.name = "June";
		d2.salary = 450000;
		d2.licenceId = "JL355";
		d2.dermID = "D789";
		
		d2.checkUp("Mell");
		
		System.out.println("----------------");
		
		//Creationg a dermatologist with 4 parameters
		Dermatologist d3 = new Dermatologist("Alban", 380000, "AL352", "D938");
		
		d3.checkUp("Cihan");
		d3.applySkinTreatment();
		
		System.out.println("----------------");

		//The constructors are NOT inherited
//		Dermatologist d4 = new Dermatologist("Can", 390000, "TR352");
	}

}
