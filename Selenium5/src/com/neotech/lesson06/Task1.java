package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement bYear = driver.findElement(By.id("year"));
		WebElement bMonth = driver.findElement(By.id("month"));
		WebElement bDay = driver.findElement(By.id("day"));

		Select selectYear = new Select(bYear);
		Select selectMonth = new Select(bMonth);
		Select selectDay = new Select(bDay);
		
		selectYear.selectByValue("1999");
		selectMonth.selectByValue("3");
		selectDay.selectByValue("19");
		
		Thread.sleep(5000);
		
		tearDown();
	}
	
}
