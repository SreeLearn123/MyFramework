package Day8;

public class Constructor_overloading2 
{
	//Types of constructors
	//1).Default constructor
	Constructor_overloading2()
	{
		System.out.println("This is same constructor....");
	}
	//2).Parameterized constructor
	Constructor_overloading2(int a,int b)
	{
		System.out.println(a+b);
	}
	//3).Parameterized constructor
	Constructor_overloading2(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	//4).Parameterized constructor
	Constructor_overloading2(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
	 
	
	public static void main(String[] args){
	// Constructor_overloading2 con=new  Constructor_overloading2();
	// Constructor_overloading2 obj=new  Constructor_overloading2(10,20);	
		// Constructor_overloading2 co=new  Constructor_overloading2(10,20,30);
	Constructor_overloading2 co=new  Constructor_overloading2(10 ,20,10.5);
	}

}
