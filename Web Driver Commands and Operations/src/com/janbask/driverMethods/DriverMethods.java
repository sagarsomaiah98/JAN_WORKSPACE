package com.janbask.driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
		
//shortcut to import everything is ctrl+shift+O
	      
	      driver.manage().window().maximize();//maximized the browser
	      
	      driver.navigate().to("https://saucedemo.com");
	      driver.navigate().to("https://bing.com");
	      driver.navigate().to("https://janbask.com");
	      
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      
	      driver.navigate().back();
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().forward();
	      driver.navigate().refresh();
	      
	     String title= driver.getTitle();
	     
	     System.out.println(title);
	     
	    // driver.close();
	     
	     driver.quit();
	      
	}

}
