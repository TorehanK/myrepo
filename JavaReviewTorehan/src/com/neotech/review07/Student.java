package com.neotech.review07;

public class Student {
	
	
	//the job of constructor is to set instance variables/ static = non objects, constructors = objects

	//instance variables
	String name;
	int age;
	
	// static-class variable
	static String school; //static means all students from this school
	
	public Student(String name, int age) {  //both name and age are same name as instance variable
		//name = name;  cannot do it
		this.name = name;
		this.age = age;
		
	}
	//instance method---> belongs to object (exp:s2,s3)
	public void displayStudentInfo() {
		System.out.println("My name is " + this.name + " AND my age is " + this.age + " AND my school is " + Student.school); //or just school is OK
	}
	
	public static void main(String[] args) {
	
		school = "Neotech"; //can be accessed without object because it is static/ it is this for all people
		
//		Student s1 = new Student();  -----> Compile Error(no parameter is undefined)
		
		Student s2 = new Student("Gorkem",25);
		s2.displayStudentInfo();
		
		Student s3 = new Student("Emine", 18);
		s3.displayStudentInfo();
		
		
	}
	
}
