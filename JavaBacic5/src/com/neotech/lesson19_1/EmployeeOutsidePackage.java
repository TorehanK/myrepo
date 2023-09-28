package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {
	

	public static void main(String[] args) {
		

		Employee.company = "Neotech";
		Employee emp = new Employee();
		emp.name = "Emre"; //we can access this because it is public
//		emp.lastName = "Cinar"; //this is protected, so we cannot access it
//		emp.salary = 12345; //this is default, so we cannot see it
//		emp.ssn = 123123;  //this is private so we cannot see it
		
		//can we access methods?
		emp.method1();
		//for any of these methods, if I need to access them I will have to change their modifiers
//		emp.method2();
//		emp.method3();
//		emp.method4();
//		
//		emp.method5(); --> totally different issue, we dont have method5, thats why error
		

		
		
		
		
		
		
		//EXPLANATION OF ALL
//		Employee
//		- (s) company
//		- name
//		- lastName
//		- salary
//		- ssn
//		- method1()
//		- method2()
//		- method3()
//		- method4()
//		
//
//	- check what can we access within the same class
//
//		- create a main method inside the same class and try to access the elements of Employee
//		RESULT:
//		- we can access them all (all public, protected, default, and private elements)
//
//	- check what can we access from another class inside the same package
//		
//		- we created EmployeeWithinPackage class
//		- we tried to see which elements can we access from there
//		RESULT:
//		- we can access all public, protected, and default elements but none of the private 
//		declared elements
//		
//	- check what can we access from another class in a different package
//		
//		- we created EmployeeOutsidePackage class
//		- we tried to see which elements can we access from there
//		RESULT:
//		- we can only access public elements
//		
		
		
	}

}
