package keywordexception;

public class trow {

	public static void main(String[] args) {
		try
		{
			throw new IllegalAccessException("ABHI");
		
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e);
		}

	}

}
