package com.neotech.lesson31;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {
	
//	Create a map of car models that you have in your garage and for each model the number of car you have.
//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
//	For example:
//	"BMW" -> 2
//	"Mercedes" -> 3
//	"Audi" -> 3
//	"Ferrari" -> 1
//
//	- Check how many entries you have.
//	- Update the number of Audis to 5.
//	- Add a new model with any number of cars.
//	- Check how many Ferraris you have.
//	- Check if you have Honda in your map.
//	- Remove Ferrari from the map.
//	- Get all models from the map. (use keySet() method)
//
//	Note: After each step print the map.

	public static void main(String[] args) {
		
		//List<String>
		//Map<K,V> ----> K: key, V: Value
		
		Map<String, Integer> cars = new LinkedHashMap<>();
		
		cars.put("BMW", 2);
		cars.put("Mercedes", 3);
		cars.put("Audi", 3);
		cars.put("Ferrari", 1);
		
		//check how many entries we have
		System.out.println("How many entries we have?");
		System.out.println(cars.size());
		System.out.println(cars);
		
		//- Update the number of Audis to 5.
		cars.replace("Audi", 5);
		//cars.put("Audi", 5);  --> this works too
		
		//- Add a new model with any number of cars.
		System.out.println("Adding a new model:");
		cars.put("Lexus", 3);
		
		//- Check how many Ferraris you have.
		System.out.println("How many ferraries are there?");
		System.out.println(cars.get("Ferrari"));
		
		//- Check if you have Honda in your map.
		System.out.println("Do we have a honda?");
		System.out.println(cars.containsKey("Honda"));
		
		//- Remove Ferrari from the map.
		System.out.println("Remove ferrari");
		cars.remove("Ferrari");
		System.out.println(cars);
		
		//- Get all models from the map. (use keySet() method)
		System.out.println(cars.keySet()); //printing directly
		
		//if we need to do something with this set, we can create a set 
		Set<String> keys = cars.keySet();
		System.out.println(keys);
		
	}
}
