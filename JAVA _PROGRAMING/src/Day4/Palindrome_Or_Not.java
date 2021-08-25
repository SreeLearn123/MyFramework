//package Day4;
import java.util.Scanner;
public class Palindrome_Or_Not {

	public static void main(String[] args)
	{
		//12456 65421
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    
    
      int num=sc.nextInt();
      int original_num=num;
      int rev=0;
      
      while(num!=0)
      {
    	  rev=rev*10+num%10;
    	  num=num/10;
      }  
      if(original_num==rev)
      {
    	  System.out.println(original_num+"palindrome");
      }
      else
      {
    	  System.out.println(original_num+"is not palindrome");  
      }
	}

}
