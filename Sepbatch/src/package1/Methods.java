package package1;
// 1- when a method take the inputs and give the output
public class Methods {
	public void abc(int a, int b)// parameterized and non void method (example)
	{
		// method name abc
		// method type 2 parameterized method(take the inputs)
		// method output : 2 integer value (give the output)
	}
	
	
// 2- when a method take the inputs and can't give the output
	public void abcd(int a, int b) // parameterized and void method (example)
	{
		// method name : abcd
		// method type : 2 parameterized method (take the inputs)
		// method output : can't return any value
	}
	
// 3- when a method can,t take the inputs and it give the outputs
	public void abcde() // default and non void method (example)
	{
		// method name : abcde 
		// method type : not taking any input value
		// output type : it will return integer value
	}
// 4- when a method can't take the inputs and it can't give the output
	public void dc()// default and void method (example)
	{
		// method name : dc
		// method type : default method
		// output : it will not return any value
	}
// 5- wnen a method can take different input vaule and give different value
	public int abs(float a, int b)// parameterized + non void method
	{
		// method name : abs
		// method type : parameterized method (take different type value)
		// output : it will return int value 
	}
}
