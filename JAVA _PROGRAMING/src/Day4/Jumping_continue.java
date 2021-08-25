package Day4;

public class Jumping_continue {

	public static void main(String[] args) {

		/*for (int i=1;i<=10;i++)
		{
			if(i==5)
			continue;//it will skip num5
			System.out.println(i);
		}
	
		System.out.println("Break.....");*/
		
		//if i want to skip all odd num b/w 1 to 10
	/*	for (int i=1;i<=10;i++)
		{
			if(i==1  || i==3 || i==5 || i==7 
					|| i==9)//Using OR operator
			continue;//it will skip num5
			System.out.println(i);
		}*/
	//skip even num b/w 1 to 10
		System.out.println("Break.....");
		for (int i=1;i<=10;i++)
		{
			if(i==2  || i==4 || i==6 || i==8 
					|| i==10)//Using OR operator
			continue;
			System.out.println(i);
		}
	
		System.out.println("Exit.....");
		
	}

	}


