package day2;

public class swappingtwoNumbers {

	public static void main(String[] args)
	{
		
		//swapping two numbers useing temp variable
		int a=10;
		int b=20;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping a= "+a);
		System.out.println("After swapping b= "+b);
		//
		//swapping again the two numbers without using temp variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped value of a "+a);
		
		System.out.println("swapped value of b "+b);
		

	}

}
