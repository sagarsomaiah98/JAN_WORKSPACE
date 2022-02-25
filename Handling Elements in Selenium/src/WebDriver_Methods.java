import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.getPageSource();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.navigate().to("");
		
		 WebElement element=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		 
	
		 element.sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		 WebElement Login= driver.findElement(By.xpath("//input[@id='btnLogin']"));
		 System.out.println("Login button text value is  = "+Login.getAttribute("value"));
		 Login.click();

	}

}
