package package1;

public class ConstructorExample {
	
	public ConstructorExample()
	{
		this(10,20,30);
		System.out.println("Default constructor");
	}
	public ConstructorExample(int a)
	{
		this();
		System.out.println("One parametrised constructor");
	}
	public ConstructorExample(int a,int b)
	{
		this(10,20,30,40);
		System.out.println("Two parametrised constructor");
	}
	public ConstructorExample(int a,int b,int c)
	{
		System.out.println("Three parametrised constructor");
	}
	public ConstructorExample(int a,int b,int c,int d)
	{
		this(10);
		System.out.println("Four parametrised constructor");
	}
	public ConstructorExample(int a,int b,int c,int d,int e)
	{
		System.out.println("Five parametrised constructor");
	}
	public static void main(String[] args) {
		
		ConstructorExample obj=new ConstructorExample(12,20);
	

	}

}
