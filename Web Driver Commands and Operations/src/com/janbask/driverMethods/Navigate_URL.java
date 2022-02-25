package com.janbask.driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_URL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://saucedemo.com");
	
	Thread.sleep(3000);
	
	driver.get("https://bing.com");

	}

}
