package thread;
import java.io.*;
public class Extending extends Thread{
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				sleep(1000);
				System.out.println("Good Morning");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

public static void main(String args[])
{
	Extending  a1 = new Extending();
	a1.start();
}
}
