package Day7;
//This is approach 1
public class Employee_1
{
	int eid;
	String ename;
	int esal;
	String ejob;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(ejob);
	}
	void bonus()
	{
		System.out.println("Bonus is: "+ esal*10/100);	
	}	
/*	public static void main(String[] args)
	{
	Employee_1 emp1=new Employee_1 ();
	emp1.eid=1001;
	emp1.ename="sreelatha";
	emp1.esal=90000;
	emp1.ejob="manager";  
	emp1.display();
	emp1.bonus();
	
	Employee_1 emp2=new Employee_1 ();
	emp2.eid=1002;
	emp2.ename="Sai";
	emp2.esal=91000;
	emp2.ejob="manager";  
	emp2.display();
    emp2.bonus();
	}*/

}
