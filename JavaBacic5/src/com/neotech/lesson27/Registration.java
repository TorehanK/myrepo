package com.neotech.lesson27;

public class Registration {

	
//	Homework 1:
//	    Create Registration Class in which you would have
//	    variables as email, userName and password that
//	    have an access scope only within its own class.
//	    After creating an object of the class user should be
//	    able to call methods and in each method separately
//	    pass values to set users email, username and
//	    password.
//
//	    Requirements:
//	    Valid email consider to be only yahoo!
//	    Valid userName and password cannot be empty and should be of length larger than 6 characters.
//	    Also valid password cannot contain userName.
	
	private String email;
	private String password;
	private String userName;
	
	//getter for email
	public String getEmail() {
		return email;
	}
	
	//Setter for email
	public void setEmail(String email) {
		if(email.endsWith("yahoo.com")) {
			this.email = email;
		}else {
			System.out.println("Only yahoo emails are accepted!");
		}
	}
	
	//getter for userName
	public String getUsername() {
		return userName;
	}
	//Setter for userName
	public void setUsername(String userName) {
		if(!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		}else {
			System.out.println("Username should be larger than 6 characters!");
		}
	}
	
	//getter for password
	public String getPassword() {
		return password;
	}
	
	//Setter for password
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			if(password.length() > 6) {
				if(!password.contains(userName)) {
					this.password = password;
				}else {
					System.out.println("Password cannot contain the username!");
				}
			}else {
				System.out.println("Password cannot be less than 6 characters!");
			}
		}else {
			System.out.println("Password cannot be blank!");
		}
	}
	
	
	
	
}
