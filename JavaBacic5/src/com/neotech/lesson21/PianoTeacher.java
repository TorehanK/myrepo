package com.neotech.lesson21;

public class PianoTeacher extends Teacher {

	boolean ownApiano;

	public void playsPiano() {
		System.out.println(fullName + " plays the piano very well");
		if (ownApiano == true) {
			System.out.println(fullName + " owns a piano");
		} else {
			System.out.println(fullName + " does not own a piano");
		}
	}

	public static void main(String[] args) {
		PianoTeacher pt = new PianoTeacher();
		pt.fullName = "Achraf A.";
		pt.major = "Music";
		pt.gender = 'M';
		pt.ownApiano = true;
		pt.yearsOfExperience = 12;

		pt.teaches();
		pt.playsPiano();
	}

}
