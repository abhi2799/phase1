package trycatch;

public class trcat {

	public static void main(String[] args) {
		try 
		{
			int a=10,b=2;
			int c=a/b;
			int d[]= {10,20,30};
			System.out.println(c);
			System.out.println(d[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("After the catch statement");
	}

}
