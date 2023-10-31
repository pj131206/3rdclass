package Assignment1;

public class Student {
		int rollno;
		int age;
	public void display()
	{
		System.out.println("welcom to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student objstu=new Student();
		objstu.age = 36;
		objstu.rollno = 31251;
		System.out.println(objstu.age);
		System.out.println(objstu.rollno);
		objstu.display();
		objstu.display2();
		
	}

}
