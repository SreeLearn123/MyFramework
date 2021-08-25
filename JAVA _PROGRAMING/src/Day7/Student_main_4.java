package Day7;

public class Student_main_4 {

	public static void main(String[] args)
	{
		// approach 1 By using object reference variable
		//Student_3 stu1=new Student_3();
		/*stu1.sid=001;
		stu1.sname="Sanutha";
		stu1.grade='A';
		stu1.show();*/
		
		//Student_3 stu2=new Student_3();
		/*stu2.sid=002;
		stu2.sname="Jyothi";
		stu2.grade='A';
		stu2.show();*/
//Approach 2_by using a new method eg:setData
	/*stu1.setData(001,"SAnu",'A');//objectname.2nd method name(assign values);then 
	stu1.show();//object name.1st method name
	stu2.setData(002,"Jyo",'A');
	stu2.show();*/
		//Approach 3 ----> using constructor
		Student_3 stu1=new Student_3(001,"Sanu",'A');//passing values through constructor
		stu1.show();
		Student_3 stu2=new Student_3(002,"Jyo",'A');
		stu2.show();
		
	}

}
