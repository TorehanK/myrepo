package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("Hershey");
		choco.add("Godiva");
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tres Leches");
		
		//add all elements of choco on the sweets ArrayList
		sweets.addAll(choco);
		
		System.out.println("The size of sweets is: " + sweets.size());
		System.out.println(sweets);
		
		//Iterate
		// We can iterate using Normal for loop
		// We can iterate using enhanced for loop(for-each)
		// We can iterate using Iterator
		
		
		// Iterator for string objects -- to iterate the objects of sweets
		Iterator<String> it = sweets.iterator();  //ctrl+shift+o --> under java package
		
		
		// it.hasNext() checks if there are any more elements--> prints until false so, nothing is inside 
		while(it.hasNext()) {  //hasNext() ---> returns boolean
			String element = it.next(); // Get the next element
			System.out.print(element + "-");
			
			if(element.equals("Kinder")) { //remove kinder
				it.remove();
			}
		}
		System.out.println();
		
		System.out.println(sweets);
		//advanced for loop
		for(String str : sweets) {
			System.out.print(str + "-");
		}
		System.out.println();
	
	//Normal for loop
	for(int i = sweets.size() -1; i >= 0; i--) {
		System.out.print(sweets.get(i) + "-");
	}
	}
}
