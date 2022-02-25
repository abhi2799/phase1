package keywordexception;

public class fially {

	public static void main(String[] args) 
	{
		try
		{
			int a=14,b=2;
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}

	}

}
