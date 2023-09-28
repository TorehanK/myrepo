package com.neotech.lesson21;

public class Teacher {
	String fullName, major;
	char gender;
	int age;
	int yearsOfExperience;

	public void teaches() {
		System.out.println(fullName + " is a teacher");
		System.out.println(fullName + "`s major is " + major);
	}
}
