package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

//Create arrayList with 6 different words. 
//Remove every word that end with 'e'. Use iterator.

public class Task1 {
	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();

		words.add("Torehan");
		words.add("Mehmet");
		words.add("Tele");
		words.add("Kele");
		words.add("Furkan");
		words.add("Selen");

		System.out.println(words);

		Iterator<String> it = words.iterator();

		while (it.hasNext()) {
			String word = it.next();

			if (word.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(words + " ");

	}

}
