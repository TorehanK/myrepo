package com.neotech.lesson12;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class oylesine extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i = 1; i < 10; i++) {
		setUp();
		
		
		driver.findElement(By.xpath("//*[@id=\"listing-page-cart\"]/div[5]/div[1]/div[4]/div[2]/form/div/button")).click();
		Thread.sleep(1000);
		
		
		
		tearDown();
		}
		
	}
}
