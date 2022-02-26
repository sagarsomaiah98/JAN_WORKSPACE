import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngMethods {
	
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("**************BEFORE METHOD*********************");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("**************AFTER METHOD*************");
	}
	
	@Test
	public void method1() {
		
		System.out.println("method1");
	}
	@Test
	public void method2() {
		
		System.out.println("method2");
	}
	@Test
	public void method3() {
		System.out.println("method3");
	}
	@Test
	public void method4() {
		
		System.out.println("method 4");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("** BEFORE TEST **");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("***After Test***");
	}

}
