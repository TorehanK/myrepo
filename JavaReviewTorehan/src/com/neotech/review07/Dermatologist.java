package com.neotech.review07;

public class Dermatologist extends Doctor{
	
	
	String dermID;
	
	//we need a default constructor in parent to use this
	public Dermatologist() {
		//super();
		//implicitly it is calling the default constructor of the parent
	}
	
	//The constructors are NOT inherited
	Dermatologist(String name, int salary, String licenceId, String dermId){
		
		super(name, salary, licenceId); //same as below because it was already created
//		super.name = name; // in super class
//		super.salary = salary; // in super class
//		super.licenceId = licenceId; // in super class
		this.dermID = dermId; // in this class
		
	}
	
	
	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}

}
