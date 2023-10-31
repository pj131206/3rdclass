package Assignment1;

//((((10+2)+2)-2)*2)/2)

public class assignment2 {
	
	public int sum(int a, int b)
	{
	
	int c;
	c= a+b;
	System.out.println("sum result is "+c);
	return c;
	}
	public int subtract(int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("Subtract result is " + z);
		return z;		
	}
	
	public int multi(int m1, int m2)
	{
		int m3;
		m3= m1*m2;
		System.out.println("Multi result is "+m3);
		return m3;
	}
	public void div(int d1, int d2)
	{
		int d3;
		d3= d1/d2;
		System.out.println("Final result is "+d3);
	}
	
	public static void main(String[] args) {
		assignment2 obj=new assignment2();
		int sumresult=obj.sum(10,2);
		int sumresult2=obj.sum(sumresult, 2);
		int subresult=obj.subtract(sumresult2, 2);
		int multiresult=obj.multi(subresult, 2);
		obj.div(multiresult, 2);
		
		
				
	}
}
