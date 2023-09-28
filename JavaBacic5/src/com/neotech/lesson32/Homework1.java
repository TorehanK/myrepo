package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {
	
	//Create a Map that will store Employee name and salary.
	//Write a logic to retrieve an employee who gets the highest salary
	//Output should be in the below format
	
	public static void main(String[] args) {
		
		Map<String, Integer> empMap = new HashMap<>();
		
		empMap.put("Helen", 105000);
		empMap.put("Emre", 115000);
		empMap.put("Fulin", 99000);
		empMap.put("June", 125000);
		empMap.put("Ahmet", 95000);
		
		System.out.println(empMap);
		
		
		//Lets find the highest salary
		Collection<Integer> salaries = empMap.values();
		System.out.println(salaries);
		
		int max = 0;
		//Lets use a enhanced for-loop
		
		for(Integer s : salaries) {
			if(s>max) {
				max = s;
			}
		}
		System.out.println("The highest salary is: " + max);
		
		System.out.println(Collections.max(salaries)); //---> max method in the collection class, a shorter way!
		
		System.out.println("-----------------------");
		
		Set<Entry<String, Integer>> entrySet = empMap.entrySet();
		
		Iterator<Entry<String,Integer>> it = entrySet.iterator(); //Entry ---> entries are stored in a map, we have to store both together
		
		Entry<String,Integer> maxEntry = it.next();
		
		while (it.hasNext()) {
			Entry<String,Integer> entry = it.next();
		
			if(entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		
		System.out.println("The highest is ->" + maxEntry.getKey() + "=$" + maxEntry.getValue());
		
		//HW for lazy students
		//Get the keys using a keySet(), from there compare the values
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
