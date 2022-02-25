package method;

public class ExecuteMethod 
{
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		ExecuteMethod b=new ExecuteMethod();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

}