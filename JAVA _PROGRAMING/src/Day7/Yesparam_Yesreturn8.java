package Day7;

public class Yesparam_Yesreturn8
{
	int x;
	int y;
	int  add(int a,int b)
	{
		x=a;
		y=b;
		return (x+y);
	}
//Taking arguments/ params and yes return value
	public static void main(String[] args)
	{
		Yesparam_Yesreturn8 cal=new Yesparam_Yesreturn8();
		cal.x=100;
		cal.y=200;
		cal.add(100,200);
	System.out.println(cal.add(100,200));	

	}

}
