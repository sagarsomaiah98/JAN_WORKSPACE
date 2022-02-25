import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce_Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 
	       WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://login.salesforce.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			System.out.println("on launching ");
			Set<String> windows= driver.getWindowHandles();
			
			System.out.println(windows.size());
			driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
			Thread.sleep(3000);
			System.out.println("after clicking login");
			Set<String> windows1= driver.getWindowHandles();
			System.out.println(windows1.size());
			
			

	}

}
