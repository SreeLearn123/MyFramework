package Day7;

public class NO_par_yesreturn6
{
	int x,y;
	int res;
	int add()
	{
		return x+y;
	}

	public static void main(String[] args) {
		NO_par_yesreturn6 cal=new NO_par_yesreturn6();
		cal.x=100;
		cal.y=200;
		int res=cal.add();
		System.out.println(cal.add());

	}

}
