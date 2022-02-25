package inner;
abstract class AnonymousinnerClass{
	abstract void run();
}
public class InnerAno {
	public static void main(String args[])
	{
		AnonymousinnerClass I = new AnonymousinnerClass()
		{
			public void run()
			{
				System.out.println("working of AnonymousinnerClass");
			}
	
		};
		I.run();
	}

}
