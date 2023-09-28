package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean goodWithNumbers;

	public void teachesMath() {
		System.out.println(fullName + " teaches MATH!");
	}

	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher();
		mt.fullName = "Emilija M."; // coming from base class
		mt.major = "Math"; // coming from base class
		mt.goodWithNumbers = true; // coming from current class

		mt.teaches(); // coming from base class
		mt.teachesMath(); // coming from current class
	}

}
