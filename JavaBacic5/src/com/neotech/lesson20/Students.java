package com.neotech.lesson20;

public class Students {

	// Write a java program of Class Students that takes students name and 3 subject
	// grades. Inside your class also have a method to
	// Calculate Average Grade. Test Student class for 5 different students with
	// different marks. Your program should print an average
	// mark of each studentsname.
	String name;
	int grade1, grade2, grade3;

	
	//DONT put any kind of logic, set properties only in the constructor, use it like a template
	Students(String studentName, int g1, int g2, int g3) {
		name = studentName;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}

	int average() {
		return (grade1 + grade2 + grade3) / 3;
	}

	public static void main(String[] args) {

		Students st1 = new Students("Torehan", 96, 94, 97);
		Students st2 = new Students("Yavus", 95, 98, 93);
		Students st3 = new Students("Yildirim", 92, 100, 93);
	

		System.out.println(st1.name + " has an avg of " + st1.average());
		System.out.println(st2.name + " has an avg of " + st2.average());
		System.out.println(st3.name + " has an avg of " + st3.average());
		
		System.out.println("---------------------------------------------------");
		
		st1.grade1 = 100;
		System.out.println(st1.name + " has an avg of " + st1.average());

		

		
	}
}
