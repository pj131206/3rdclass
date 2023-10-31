package package1;
//{  } indicates this the boundary of the class
// Piller 1 -- Class Creation -- A class contains variable + method
// what is variable? which store some value and value can be change
// what is method ? for performing any action/ Operation we create method 


public class Student // Class name is Student
{
	int a; //that is a variable it will store integer value
	public void display()
	{ // this is the boundary of the method
		System.out.println("Welcome to all of you guys");
		
	}
	public static void main(String[] args)
	{
		Student pravin=new Student();
		pravin.display();
		pravin.a=233;
		System.out.println(pravin.a);
		pravin.a=520;
		System.out.println(pravin.a);
	}

}
