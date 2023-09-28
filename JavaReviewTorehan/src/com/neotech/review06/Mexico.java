package com.neotech.review06_1;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {

		USA us = new USA();
		
		System.out.println("Which variables can I access from inside the Mexico class?");
		
		System.out.println("public ---> " + us.bestSchool);
		//private, default, and protected cannot be seen from here
	//	System.out.println("default --> " + us.bestState);
	//	System.out.println("protected --> "  + us.mainState);
	//	System.out.println("private ---> " + us.capitalCity);
		
		
		System.out.println("Which methods can I access from inside the Mexico class?");
		
		us.speakEnglish();
	
		//	us.playNBA();	is protected
	//	us.selectPresident(); is private
		
	}

}
