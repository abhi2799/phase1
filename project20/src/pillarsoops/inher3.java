package pillarsoops;
class A
{
	int l=10,b=30;
}
class B extends A
{
	int h=40;
	int volume()
	{
		return l*b*h;
	}
}

public class inher3
{
	public static void main(String args[])
	{
		B a1 = new B();
		int r = a1.volume();
		System.out.println("The Volume is:"+r);		
	}
}
