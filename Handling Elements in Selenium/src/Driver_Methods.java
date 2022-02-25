

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		
		
		
		String title =driver.getTitle();
		System.out.println("title of the page == "+title);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		
		
		
		
		/*
		 * Thread.sleep(3000); driver.get("http://www.bing.com");
		 */
		
		//driver.close();
		//driver.quit();
		 
	}

}
