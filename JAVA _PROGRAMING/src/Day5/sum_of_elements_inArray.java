package Day5;

public class sum_of_elements_inArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
	int sum=0;
	/*for(int i=0;i<=4;i++)
	{
		
		sum=sum+a[i];
	}
 System.out.println(sum);*/
	//enhanced for loop
	for(int value:a)
	{
		sum=sum+value;
	}
	System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
