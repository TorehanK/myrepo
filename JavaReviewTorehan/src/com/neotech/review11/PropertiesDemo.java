package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
//		String filePath = "C:\\Users\\toreh\\eclipse-workspace\\JavaBacic5\\configs\\example.properties";
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//I created the full path to the file
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);
		
		//fileIS will help me read the file
		FileInputStream fileIS = new FileInputStream(filePath);
		
		//proper is a Map(Key-Value pairs)
		Properties proper = new Properties(); //Properties is grandchild of hashMap,hashTable
		
		//load method will help me read from the file to the proper-map
		proper.load(fileIS);
		System.out.println(proper); //random order
		
		
		//1st way
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);
		
		//2nd way, the correct way(way we use)
		String school = proper.getProperty("School"); //whatever you store, I get it as a string
		System.out.println(school);
		
		//I will get the Age as a String because of getProperty()
		String age = proper.getProperty("Age");
		System.out.println(age);
		
		//Add more key->value pairs
		proper.setProperty("SSN", "643-82-1985");
		System.out.println(proper);  //new entry-adding new key-value pair
		
		//Re-assign the Age
		proper.setProperty("Age", "50");
		System.out.println(proper);
		
		//Now let us save into a new file
		
		//The path to the new file
		String newPath = projectPath + "/extra/NewFile.txt";
		FileOutputStream fileOS = new FileOutputStream(newPath);
		proper.store(fileOS, "Onder is very happy!");
		
	}

}
