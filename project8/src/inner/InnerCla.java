package inner;

public class InnerCla 
{
	private String msg="hi hello welcome";
	private String msg1="message will display";
	class inner
	{
		void hello()
		{
			System.out.println(msg+"start working with innerclasses");
			System.out.println(msg1);
		}
	}
	public static void main(String args[])
	{
		InnerCla obj = new InnerCla();
		InnerCla.inner in = obj.new inner();
		in.hello();
	}

}
