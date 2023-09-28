package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods{
	
//	1) Navigate to
//	http://samples.gwtproject.org/samples/Showcase/Showcase.html#!Cw
//	FileUpload
//	2) Upload file
//	3) Verify file got successfully uploaded and take screenshot

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/Homework2/";
		
		sendText(driver.findElement(By.id("//*[@class='gwt-Button']")), getAlertText());
		
		
		
		
		
		
		tearDown();
		
	}
}
