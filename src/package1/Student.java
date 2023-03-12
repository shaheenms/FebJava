package package1;

public class Student {
	
	//variable declared
	int age;
	int roll_no;
	
	//method
	public void dispaly1()
	{
		System.out.println("Welcome to all of you");
	}

	public void dispaly2()
	{
		System.out.println("Automation is very easy");
	}	
	
	
	public static void main(String[] args) {
		
		Student std=new Student();
		std.dispaly1();  //method calling
		std.dispaly2();
		std.age=21;
		System.out.println("Student's age is :" +std.age);  //printing the val of variable
		std.roll_no=10;
		System.out.println("Student's roll no is :"+std.roll_no);
		
	}



}

