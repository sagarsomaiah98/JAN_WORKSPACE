
public class Addition_Parameters {
	
	
	
	public void addition(int d, int e) {
		
		
		
		
		int c=d+e;
		
		System.out.println("Addition of two numbers "+d +" and "+e+" is " +c);
	}

	public static void main(String[] args) {
		
		
		Addition_Parameters a= new Addition_Parameters();
		a.addition(50, 100);
		a.addition(10, 90);
		a.addition(80, 60);
		a.addition(10, 0);

	}

}
