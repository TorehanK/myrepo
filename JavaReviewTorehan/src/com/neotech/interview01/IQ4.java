package com.neotech.interview01;

public class IQ4 {
	public static void main(String[] args) {

		// Find out how many alpha characters are present in a String?
		// Find number of words in string?
		
		String x = "Hlsfm$2eıor/&1jr=^34as";
		
		System.out.println(x.length());
		
		
		x = x.replaceAll("[a-zA-Z1-9]", "");
		System.out.println(x);

		
		System.out.println(x.length());
		
		
		
	}
}
