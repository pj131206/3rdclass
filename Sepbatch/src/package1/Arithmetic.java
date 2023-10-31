package package1;

public class Arithmetic {
	
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("sum result is "+c);// + use for concatenation
		return c;
	}
	
	public int subtract(int x, int y)
	{
		int z;
		z = x-y;
		System.out.println("subtract restul is " + z);
		return z;
	}
	
	public void multi(int a1, int a2)
	{
		int a3;
		a3 = a1*a2;
		System.out.println("final result is "+a3);
	}
	public static void main(String[] args)
	{
	Arithmetic obj=new Arithmetic();
	int sumresult=obj.sum(12, 2);
	int subresult=obj.subtract(22, 2);
	obj.multi(sumresult, subresult);	
	}
}
