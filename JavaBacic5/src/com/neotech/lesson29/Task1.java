package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {

//	Create an arrayList with 6 names. Have at least 2 duplicates. How can you remove the duplicates from the ArrayList?
	public static void main(String[] args) {
		
	
	ArrayList<String> animals = new ArrayList<>();
	animals.add("Monkey");
	animals.add("Dog");
	animals.add("Cat");
	animals.add("Monkey");
	animals.add("Crocodile");
	animals.add("Dog");
	
	Set<String> animals1 = new LinkedHashSet<>();
	animals1.addAll(animals);
	
	System.out.println(animals1);

	
	Set<String> abc = new HashSet<>(animals);
	System.out.println(abc);
	

	}
}
