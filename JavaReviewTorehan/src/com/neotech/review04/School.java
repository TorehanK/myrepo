package com.neotech.review04;

public class School {

	public static void main(String[] args) {

	  Student student1 = new Student();
	  
	  student1.name = "Ahmet";
	  student1.studentNr = 22;
	  student1.gradeLevel = 4;
	  
	 Student student2 = new Student();
	 
	 student2.name = "Mehmet";
	 student2.studentNr = 55;
	 student2.gradeLevel = 5;
	 
	 Teacher teacher1 = new Teacher();
	 teacher1.name = "Sabah";
	 teacher1.salary = 100.000;
	 teacher1.subject = "Java";
	 
	 teacher1.subject = "Selenium"; //reassigning
	 
	 System.out.println("Let's call the methods!");
	 
	 student2.study();
	 
	 student2.sleep();
	 
	 
	 
	 
	}

}
