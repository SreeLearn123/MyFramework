package Day3;

public class B2_elseifLargest_Of3Numbers {

	public static void main(String[] args)
	{
		/*int a=10;
		int b=20;int c=30;*/
	
		int a=-1000,b=-120,c=-30;
	if(a>b && a>c)
	{
		System.out.println("a is largest");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is largest");
		
	}
	else //if(c>a && c>b)
	{	
			System.out.println("c is largest");
		
	}

	}

}
