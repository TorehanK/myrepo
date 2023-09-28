package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {
	
	public static void main(String[] args) throws IOException {
		
		//Full path
		String fullPath = "C:\\Users\\toreh\\eclipse-workspace\\JavaBacic5\\configs\\conf.properties";
		System.out.println(fullPath);
		
		// Find the user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		
		//Find the user name
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//Find the operationg system
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		System.out.println("-------------------------------");
		
		//Let's create a dynamic path
		String dynamicFilePath = System.getProperty("user.dir") + "/configs/conf.properties";
		System.out.println(dynamicFilePath);
		
		FileInputStream fis = new FileInputStream(dynamicFilePath); //add throws declaration when hovering with mouse
		
		Properties prop = new Properties();
		prop.load(fis); //add throw declaration
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		System.out.println(prop.getProperty("browser"));
		
		
		
		double a,b;
		a=10;
		b=15;
		if(a>b) {
			System.out.println("Double value a is larger than b");
		}else {
			System.out.println("Double value b is larger than a");
		}
		
	}

	
}
