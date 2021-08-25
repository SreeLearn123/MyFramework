package Day7;

public class Student_3 
{
	int sid;
	String sname;
	char grade;
	//creating constructor
	 Student_3(int id,String name,char g)
	 {
		 sid=id;
		 sname=name;
		 grade=g;
	 }
	
	void show()
	{
		System.out.println(sid+"  "+sname+"  "+grade);
	}

	void setData(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
		}
}
