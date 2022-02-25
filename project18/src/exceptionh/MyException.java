package exceptionh;

public class MyException {
	public static void main(String[] args) {
		int a,b;
		double c;
		a=100;
		b=0;
		try { 
			
			System.out.println("Startig of try block");
			c = a/b;
			} catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
			}
	}



}
