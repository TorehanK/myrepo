package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {
	/*
	 * Create a PROPERTY file to store following configurations: browser= url=
	 * username= password=
	 */
	public static void main(String[] args) throws IOException {
		// create a path for the file
//		String path = "C:\\Users\\msipc\\Documents\\GitHub\\JavaBasic5\\configs\\homework.txt";
//		System.out.println(path);

		// to avoid file location issues
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String fullPath = projectPath + "/configs/homework.txt";
		System.out.println(fullPath);

		// create an object to read the file (FileInputStream)
		FileInputStream fis = new FileInputStream(fullPath);

		// load the data from the stream
		Properties p = new Properties();
		p.load(fis);

		// what is inside the project object?
		System.out.println(p);

		// get parameters individually
		String browser = p.getProperty("browser");
		System.out.println(browser);

		browser = p.getProperty("BROWSER");
		System.out.println(browser);

		// how do I get all the values
		Set<Object> keys = p.keySet();

		for (Object o : keys) {
			System.out.println(o + " ==> " + p.get(o));
		}

		System.out.println("-----Selenium Steps------");
		System.out.println("I am opening the browser:" + p.getProperty("browser"));
		System.out.println("I navigate to this page:" + p.getProperty("url"));
		System.out.println("I will enter username:" + p.getProperty("username"));
		System.out.println("I will enter password:" + p.getProperty("password"));

		// how do we write the file?
		// Lets create a new property
		p.setProperty("phoneNumber", "555 344 3443");

		// we need an output stream to the file
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2.txt");

		// store the properties into the file
		p.store(fos, "Added phone number");

	}

}
