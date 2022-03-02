package com.sauce.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
	
		Properties prop= new Properties();
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\JAN_WORKSPACE\\Sauce_Framework\\src\\main\\java\\com\\sauce\\config\\CONFIG.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Browser"));
		

	}

}
