package keywordexception;


class A extends Exception
{
	A(String s1)
	{
		super(s1);
	}
}
public class custom {

	public static void main(String[] args) {
		try
		{
			throw new A("Custom exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
