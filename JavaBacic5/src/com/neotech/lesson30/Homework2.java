package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {
	public static void main(String[] args) {
		//Create a Set of cities in which you want to make sure that insertion order
		//is maintained. Useing iterator remove any city that starts with "A"
		
		Set<String> cities = new LinkedHashSet<>(); //LinkedHashSet does not change the order, that way we wrote it
		                                            //HashSet changes order by itself
		cities.add("Trabzon");
		cities.add("Tashkent");
		cities.add("San Diego");
		cities.add("Atlanta");
		cities.add("Calgary");
		cities.add("Berlin");
		cities.add("Sofia");

		System.out.println(cities);
		
		
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
//			String city = it.next();
//			
//			if(city.startsWith("A")) {
//				it.remove();
//			}
			if(it.next().startsWith("A")) {
				it.remove();
			}
			
			
		}
		System.out.println(cities);
		
		
		
		
		
		
		
		
	}

}
