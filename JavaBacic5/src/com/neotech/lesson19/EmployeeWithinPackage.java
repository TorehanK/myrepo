package com.neotech.lesson19;

public class EmployeeWithinPackage {
public static void main(String[] args) {
	

	Employee.company = "Neotech";

	Employee emp = new Employee();
	
	emp.name = "Yildirim";
	emp.lastName = "Likos";
	emp.salary =  1234545;
	//the field is not visible
//	emp.ssn = 1234;
	//this does not exist
//	emp.phoneNumber = 1234;
	
	
	//can we access methods
	emp.method1();
	emp.method2();
	emp.method3();
	//this method says it exist but is not visible from this class
//	emp.method4();
	//this error says it is undefined, does not exist
//	emp.method5();
	
	
	
	
	
	
	
}
}