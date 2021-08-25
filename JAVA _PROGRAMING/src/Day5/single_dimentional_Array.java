package Day5;

public class single_dimentional_Array {

	public static void main(String[] args) {
		//Declare an Array
		//approach1
		//int a[]=new int[5];
		//inserting values in to array
//we can access location by using index num
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approach2
		//here no need to specify size n index
		int a[]= {100,200,300,400,500};
		//how to find size of an array
		System.out.println(a.length);
		//read or access single value of array
		System.out.println(a[0]);
		System.out.println(a[3]);
		//how to extract all the values at a time
		/*for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}*/
		//how to extract all values with out knowing size of array
	/*	for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		//if u want to print all values  with index number
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println("Position "+i+" value is "+a[i]);
		}*/
		for(int x:a)
		{
				System.out.println(x);
			}
		
	}

}
