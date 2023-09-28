package com.neotech.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Fulin");
		names.add("Alp");
		names.add("Huseyin");
		names.add("Fulin");
		names.add("Mesut");
		names.add("Alp");
		names.add("Yildirim");

		// This will add all the list elements into the newly created set
		Set<String> set = new LinkedHashSet<>(names);
		System.out.println(set);

		// This will remove all the elements from the list
		names.clear();
		System.out.println(names);

		// This will add all the elements from the set to the list
		names.addAll(set);

		System.out.println(names);

		System.out.println("-------------------------------------------");

		// 2nd way, Create a new list and add the elements one by one
		// Before adding, check if the element already contains the element
		
		List<String> names2 = new ArrayList<>();
		names2.add("Fulin");
		names2.add("Alp");
		names2.add("Huseyin");
		names2.add("Fulin");
		names2.add("Mesut");
		names2.add("Alp");
		names2.add("Yildirim");
		
		//We created an empty list
		List<String> names3 = new ArrayList<>();
		for(String name : names2) {
			//add the element if it is NOT in the list
			if(!names3.contains(name))
			names3.add(name);
		}
		System.out.println(names3);

	}

}
