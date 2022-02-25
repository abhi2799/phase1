package diamond;

interface one
{
	default void run()
	{
		System.out.println("writing code for diamond problem");
	}
}
interface two
{
	default void run()
	{
		System.out.println("using oops concepts");
	}
}
public class DiaProblem implements one,two
{
	public void run()
	{
		one.super.run();
		two.super.run();
	}
	public static void main(String args[])
	{
		DiaProblem obj = new DiaProblem();
		obj.run();
	}

}
