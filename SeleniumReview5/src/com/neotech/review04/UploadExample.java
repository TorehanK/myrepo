package com.neotech.review04;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class UploadExample extends CommonMethods {
	
	public static void main(String[] args) {
		
		// https://neotech.vercel.app/fileUpload

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/Form.png"
		
			driver.findElement(By.id("image_file")).sendKeys(args);
		
		wait(1);

		tearDown();
		
	}

}
