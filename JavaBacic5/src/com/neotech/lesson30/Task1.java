package com.neotech.lesson30;

import java.util.HashMap;

public class Task1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Amazon");
		building.put(3, "Neotech");
		building.put(4, "Firefox");
		building.put(5, "Apple");
		building.put(6, "Samsung");
		building.put(7, "Chrome");
		
		System.out.println(building);


		System.out.println(building.size());
		building.put(4, "Mozilla");
		building.remove(7);
		System.out.println(building);
		
		
		
		
		
		
		
		
		
	}

}
