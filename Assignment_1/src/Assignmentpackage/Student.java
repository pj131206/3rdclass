package Assignmentpackage;
//create a class name student, variable age and rollno and create method two method 1-welcome to all of you 2-Automation is very easy

public class Student {
	int age;
	int rollno;
	
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student pravin=new Student();
		pravin.display1();
		pravin.display2();
		pravin.age=30;
		pravin.rollno=250;
		System.out.println("Student rollno is"+pravin.rollno + "Student age is:"+pravin.age);
		
	}
}
