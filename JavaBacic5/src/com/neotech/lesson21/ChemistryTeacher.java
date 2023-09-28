package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {

	boolean teachesApChemistry;

	public void doesExperiment() {
		System.out.println(fullName + " does chemistry experiments");
		if (teachesApChemistry == true) {
			System.out.println(fullName + " also teaches AP Chemistry");
		}
	}

	public static void main(String[] args) {
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.fullName = "Emre C.";
		ct.major = "Chemistry";
		ct.teachesApChemistry = true;
		ct.yearsOfExperience = 15;

		ct.teaches();
		ct.doesExperiment();
	}

}
