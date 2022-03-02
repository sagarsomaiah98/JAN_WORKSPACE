package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public void intialize() throws IOException 
	
	{
		
        prop= new Properties();
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\JAN_WORKSPACE\\Sauce_Framework\\src\\main\\java\\com\\sauce\\config\\CONFIG.properties");
		
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		
		
		switch(bname)
		{
		case "CHROME":
		WebDriverManager.chromedriver().setup();	
		driver= new ChromeDriver();
		break;
		case "FIREFOX":
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 break;
		 default:
	     System.out.println("INVALID BROWSER");
		  break;
		
		
		}
		
		String url=prop.getProperty("URL");
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
