package Day5;

public class Two_Dimentional_Array {

	public static void main(String[] args)
	{
		//approach1
		//Declare array
		//int [][]a=new int[3][2];int []a[]=new int[3][2];
	/*	int a[][]=new int[3][2];
		a[0][0]=100;
		a[1][0]=300;
		a[2][0]=500;
		a[0][1]=200;
		a[1][1]=400;
		a[2][1]=600;*/
		//approach 2
		int a[][]= { {100,200},
		             {300,400},
		             {500,600}
		};
		//find size of an array
		//System.out.println("number of rows"+a.length);
		//System.out.println("number of columns"+a[0].length);
     //how to read a specific /single value
		//System.out.println(a[2][1]);
		//Reading multiple values of an array
		// here we need 2 for loops i.e nested for loop
		/*for(int r=0; r<=2; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(a[r][c]);
			}

		}*/
		
		//Another approach for above method
		for(int x[]:a)
		{
			for(int val:x)
			{
				System.out.println(val+"   ");
			}
		}
		
		
		
		
	}

}
