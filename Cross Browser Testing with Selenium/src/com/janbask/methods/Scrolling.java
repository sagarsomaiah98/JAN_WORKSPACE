package com.janbask.methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.siliconfilter.com/category/reviews/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		  js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,2000)"); Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,3000)"); Thread.sleep(3000);
		 
		
		js.executeScript("window.scrollTo(1000,0)");
		
		js.executeScript("window.scrollTo(2000,0)");
		js.executeScript("window.scrollTo(3000,0)");
		
		

	}

}
