package Day8;

public class Methodoverloading1 
{
	int x,y,z;
	double d;
	void sum()
	{
		x=1;
		y=2;
		d=10.5;
		System.out.println(x+y);
	}
	
	void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum(int p,double o)
	{
		x=p;
		d=o;
		System.out.println(x+d);
	}
	void sum(int a,int b,double c)
	{
		x=a;
		y=b;
		d=c;
		System.out.println(x+d+y);
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Methodoverloading1 mo=new Methodoverloading1();
		mo.sum(10,20);
		mo.sum(100,200,300);
		mo.sum(15,10.5);
        mo.sum();
	}

}
