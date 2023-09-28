package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Test2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		//Preparing for the test
		BaseClass.setUp();
		
		// Do our test
		Thread.sleep(2000);
		//driver.findElement(By.id(""));
		
		
		
		
		// Clean up everything
		BaseClass.tearDown();
		
	}

}
