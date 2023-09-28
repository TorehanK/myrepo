package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
	
	//We are going to read
	//make changes
	//Write to the same file
	
	public static void main(String[] args) throws IOException {
		//1. Locate your .properties file
		String filePath = "C:/Users/toreh/eclipse-workspace/JavaBacic5/configs/example.properties";
		
		//2. Create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
		
		//3. To handle .properties files; we need to use Properties class in Java
		Properties prop = new Properties();
		
		//4. Load information from .properties files using load() method
		//If we forget to load the file, we will lose the information
		prop.load(fis);
		
		//Changing state to florida
		prop.setProperty("state", "Florida");
		
		//Adding a new property
		prop.setProperty("phone", "1234567890");
		
		//To write to the file, we need to use FileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "We just updated the file");
		
		
		
	}
	

}
