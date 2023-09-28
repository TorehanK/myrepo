package com.neotech.lesson27;

interface WebDriver {
	void open(); // by default public & abstract(soyut)

	void close();

	String getTitle();
}

interface TakesScreenshot {
	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened");

	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot taken by Chrome!");

	}

	@Override
	public void navigate() {
		System.out.println("Navigation through Chrome!");

	}
}

class FirefoxDriver implements RemoteWebDriver {
	@Override
	public void open() {
		System.out.println("Firefox driver opened");

	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot taken by Firefox!");

	}

	@Override
	public void navigate() {
		System.out.println("Navigation through Firefox!");
	}

}

class SafariDriver implements RemoteWebDriver {
	@Override
	public void open() {
		System.out.println("Safari driver opened");

	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot taken by Safari!");

	}

	@Override
	public void navigate() {
		System.out.println("Navigation through Safari!");
	}
}

public class Homework2 {

//	Homework 2:
//    Slide number 14 in the pdf presentation. Implement the Code for the Diagram.

	public static void main(String[] args) {
		// RemoteWebDriver rwd = new RemoteWebDriver(); --> cannot create an object of
		// an interface

		ChromeDriver cd = new ChromeDriver();
		cd.open();

		FirefoxDriver fd = new FirefoxDriver();
		fd.open();
		SafariDriver sd = new SafariDriver();
		sd.open();

		System.out.println("---Upcasting---");
		RemoteWebDriver rwd1 = cd; // Upcasting
		rwd1.open();

		RemoteWebDriver rw2 = fd; // Up-casting
		rw2.open();

		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = cd;
		remoteArray[1] = fd;
		remoteArray[2] = sd;

		for (RemoteWebDriver driver : remoteArray) {
			System.out.println("---------------");
			driver.open();
			driver.getScreenShot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();
			
		}
		
		
	}
}
