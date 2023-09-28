package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUploadsDemo extends CommonMethods {

	//https://the-internet.herokuapp.com/
		
		public static void main(String[] args) throws InterruptedException {
			
		setUp();
		
		click(driver.findElement(By.linkText("File Upload")));
		
		String filePath = System.getProperty("user.dir") + "";
		
		sendText(driver.findElement(By.id("file-upload")), filePath);
		
		wait(4);
		
		tearDown();
		
		}
}
