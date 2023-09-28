package com.neotech.lesson19;

public class Employee {

	public static String company; //if no access modifier is provided, it means default - 4 ACCESS MODİFİERS IN TOTAL public,protectec,private and default
	public String name;                                                                              
	protected String lastName;
	double salary; //no access modifier -- default
	private int ssn;
	
	//if no access modifier, then its default
	
	//formula:
//	OPTİONAL             MUST           MUST
//	access modifier ---- data type ---- variable name;
	
	//methods with different access modifiers
	public void method1()
	{
		System.out.println("I am a public method!!!");
	}
	protected void method2()
	{
		System.out.println("I am a protected method!!!");
	}
	void method3()
	{
		System.out.println("I am a default method!!!");
	}
	private void method4()
	{
		System.out.println("I am a private method!!!");
	}
	public static void main(String[] args) {
		
		//we want to see what elements we can access from within the same class
		
		Employee emp = new Employee();
		
		company = "Neotech"; //static
		emp.name = "Yunus";
		emp.lastName = "Emre";
		emp.salary = 123545;
		emp.ssn = 12345;
		
		//can we access the methods
		emp.method1(); //we can access the public method
		emp.method2(); //we can access the protective method
		emp.method3(); //we can access the default method
		emp.method4(); //we can access the private method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
