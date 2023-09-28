package com.neotech.lesson21;

public class Student {

//	String name;
//	String adress;
//	
//	Student(String studentName, String studentAdress){
//		name = studentName;
//		adress = studentAdress;
//	}
//	
//	void displayInfo() {
//		System.out.println("My name is " + name + " and my adress is " + adress);
//	}
//	
//	public static void main(String[] args) {
//		
//		Student s1 = new Student("Torehan","603 Herzel");
//		Student s2 = new Student("Mehmet","114 Plain street");
//		Student s3 = new Student("Ahmet","6003 Horizon blvd");
//
//
//		s1.displayInfo();
//		s2.displayInfo();
//		s3.displayInfo();
	
	
	
	String name, address;
	//1st constructor
	Student() { }
	//2nd constructor
	Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	//3rd constructor
	Student(String name){
		this.name = name;
	}
	public void displayInfo() {
		System.out.println("Name: " + this.name + "Adress: " + this.address);
	}
	
	
}
