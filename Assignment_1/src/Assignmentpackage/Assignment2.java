package Assignmentpackage;

// ((((10+2)+2)-2)*2)/2)

public class Assignment2 {
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("sum of result two numbers" + "  " + c);
		return c;
	}
	public int sub(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Sub of result of two numbers" + " " + z);
		return z;
	}
	public int mul(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("multi result of two number" + "  " + a3);
		return a3;
	}
	public void divide(int d1, int d2)
	{
		int d3;
		d3=d1/d2;
		System.out.println("division of two numbers" + "  " + d3);	
		
	}	
	public static void main(String[] args) {
		
		Assignment2 pra= new Assignment2();
		int sumresult=pra.sum(10, 2);
		int sumresult2=pra.sum(sumresult, 2);
		int subresult=pra.sub(sumresult2, 2);
		int multiresult=pra.mul(subresult, 2);
		pra.divide(multiresult, 2);
	}
}
