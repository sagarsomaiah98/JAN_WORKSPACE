
public class Calc {
	
	
	
	//method declaration
	public void Addition()
	{
		
	int a=50;
	int b=60;
	
	int c=a+b;
	
	System.out.println("Addition of two numbers "+a +" and "+b+" is " +c);
	
	}
	
	public void subtraction()
	{
	int k=50;
	int l=10;
	
	int m=k-l;
	
	System.out.println("Subraction of two numbers "+k +" and "+l+" is " +m);
	
	}
	public static void main(String[] args)
	{
		Calc a=new Calc();
		a.Addition();
		a.Addition();
		a.Addition();
		//a.subtraction();
		

	}

}
