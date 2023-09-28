package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	
	public static void main(String[] args) {
		
		//Create a Set collection in which you need to add names of the countries.
		//In this set we want all objects to be sorted in alphabetical order.
		//Using 2 different ways retrieve all elements from set
		
		Set<String> countries = new TreeSet<>(); //TreeSet--> sorted automatically
		countries.add("Canada");                 //HashSet--> does not sort in alphabetical order, no order in HashSet
		countries.add("Brazil");
		countries.add("Slovakia");
		countries.add("Norway");
		countries.add("Mexico");
		countries.add("Turkiye");
		
		System.out.println(countries);
		
		
		//For-each loop
		for(String country : countries) {
			System.out.print(country + " ");
		}
		System.out.println();
		
		//Iterator
		Iterator<String> it = countries.iterator(); //Iterator is for collections
		while(it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
		}
		System.out.println();
		
		//for-loop
		for(int i = 0; i < countries.size(); i++) {
//			String country = countries.get(i); //In set, there is no index ------> Cannot do it
			
		}
		
		
	}
	

}
