import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Form_Filling extends TestBase {
	
	
	public static  WebElement method(String locator) {
		
		WebElement ele= driver.findElement(By.xpath(locator));
		
		return ele;
	}
	
	
	public static String random_String() {
		
		String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
			return value;	
				
	}
    
	public static void main(String[] args) {
		//random_String();
		
		
		
		  new TestBase(); 
		  String fname="Lee";
		  String lname="Con"; 
		  String Address="24 central sydney"; 
		  String city="sydney";
		  String state=" Aus";
		  String pin ="4178"; 
		  String phone="4123456";
		  String SSN="78856";
		  String Uname=random_String(); 
		  String pwd="pwd123"; 
		  String confirm="pwd123";
		  
		  driver.get("https://parabank.parasoft.com/parabank/register.htm");
		  driver.manage().window().maximize();
		  
		  // driver.findElement(By.xpath(""))
		  method("//input[@id='customer.firstName']").sendKeys(fname);
		  method("//input[@id='customer.lastName']").sendKeys(lname);
		  method("//input[@id='customer.address.street']").sendKeys(Address);
		  method("//input[@id='customer.address.city']").sendKeys(city);
		  method(" //input[@id='customer.address.state']").sendKeys(state);
		  method("//input[@id='customer.address.zipCode']").sendKeys(pin);
		  method("//input[@id='customer.phoneNumber']").sendKeys(phone);
		  method("//input[@id='customer.ssn']").sendKeys(SSN);
		  method("//input[@id='customer.username']").sendKeys(Uname); 
		 
		//  method("//input[@id='customer.username']").sendKeys("john3365oo");
		  method("//input[@id='customer.password']").sendKeys(pwd);
		  method("//input[@id='repeatedPassword']").sendKeys(confirm);
		  method("//input[@value='Register']").click();
		  
		  String msg=method("//h1[@class='title']").getText();
		  
		  System.out.println(msg);
		  
		 
		
		
		
	

	}

}
