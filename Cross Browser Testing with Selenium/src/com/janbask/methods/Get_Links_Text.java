package com.janbask.methods;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Links_Text {

	public static void main(String[] args) {
		
		/*
		 * List<String> links= new LinkedList<String>();
		 * 
		 * links.add("red"); links.add("blue"); links.add("green"); links.add("black");
		 * links.add("white");
		 * 
		 * System.out.println(links.size()); System.out.println(links.get(5));
		 */
		
		
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//System.out.println(links.get(45).getText());
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
		}
		
		
		
		driver.close();
	}

}
