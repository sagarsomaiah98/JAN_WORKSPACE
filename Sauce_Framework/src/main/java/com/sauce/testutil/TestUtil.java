package com.sauce.testutil;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauce.testbase.TestBase;

public class TestUtil extends TestBase {
	
	public static   String getDate() {
		
		
		LocalDateTime myObj = LocalDateTime.now();
	    System.out.println(myObj);
	    
	    String dateTime=myObj.toString();
	    return dateTime;
	}
	
	
	
	
public  static void Screenshot() throws IOException {
		
		String name = driver.getTitle();;
		

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
			
	}
	
	public static void main(String args[]) {
		getDate();
		
		
		
	}

}
