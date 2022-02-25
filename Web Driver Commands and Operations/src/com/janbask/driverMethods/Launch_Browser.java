package com.janbask.driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		
		//launch firefox  browser
		
		System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\geckodriver.exe");
		
		WebDriver driver1= new FirefoxDriver();
		
		WebDriver driver2 = new EdgeDriver();
		
		WebDriver driver3 = new SafariDriver();

	}

}
