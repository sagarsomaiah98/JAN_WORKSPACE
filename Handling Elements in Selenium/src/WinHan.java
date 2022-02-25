import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHan {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 
       WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator<String> it= windows.iterator();
		
		String parent =it.next();
		String child=it.next();
		
		
		driver.switchTo().window(child);
		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 */
		
	     
	    // driver.switchTo().window(child);
		
	     Thread.sleep(3000);
		driver.findElement(By.linkText("Our Story")).click();
		Thread.sleep(3000);
		//driver.close();//single window
		driver.quit();//multiple windows
	}

}
