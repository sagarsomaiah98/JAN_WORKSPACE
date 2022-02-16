package LogicalOperators;

public class Biggest_four_Numbers {

	public static void main(String[] args) {
		
		int a=0, b=8,c=7,d=2;
		
		if(a>b & a>c & a>c & a>d)
			
			System.out.println("a is bigger");
		
		else if(b>a & b>c & b>d)
		
			System.out.println("b is bigger");
		
		else if(c>a & c>b & c>d)
		
			System.out.println("c is bigger");
		
		else 
		
			System.out.println("d is bigger");

	}

}
