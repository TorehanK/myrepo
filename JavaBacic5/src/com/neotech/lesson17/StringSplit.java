package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {

		//split()
		
		String sentence = "Today is Tuesday and we are learning Java!";
		
		String[] result = sentence.split(" ");
		
		for(String word:result) {
			System.out.print(word + "|");
		}
		System.out.println();
		System.out.println("This sentence has " + result.length + " words!");
		
		
		String[] array = sentence.split("e");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "       ");
		}
		System.out.println();
		
		
		
		//we can use regex as split criteria
		
		String list = "1.Nur2.Cihan3.Zeynep4.Aylin";
		
		String[] arr = list.split("[^a-zA-Z]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");  //print the name and tab space(8 spaces)
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
