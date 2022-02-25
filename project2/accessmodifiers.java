package access;

public class accessmodifiers {
	class def Access Specifier
	{
		void display()
		{
			System.out.Println("you are using default access specifier");
		}
	}
	public class access specifier1{
		public static void main(string[] args) {
			System.out.Println("default access specifier");
			def Access Specifier obj = new def Access Specifier();
			obj.display()
		}
	}
	class private Access Specifier
	{
		void display()
		{
			System.out.Println("you are using private access specifier")
		}
	}
	public class access specifier2
	{
		public static void main(string[] args) 
		{
			System.out.Println("private access specifier");
			private Access Specifier obj = new private  Access Specifier();
		}
	}
	package pack1;
	public class protected Access Specifier
	{
		protected void display()
		{
			System.out.Println("this is protected access specifier");
		}
	}
	package pack2;
	import pack1.*;
	public class Access Specifier extends protected Access Specifiers{
		public static void main(sting[] args) {
			access specifier 3 obj = new access specifiers3();
			obj.display()
		}
	}
	package pack1;
	public class public Access Specifier
	{
		public void display()
		{
			System.out.Println("this is public access specifier");
		}
	}
	package pack2;
	import pack1.*;
	public class Access Specifier4
	{
		public static void main(String[] args)
		{
			public Access Specifiers obj = new public Access Specifier();
			obj.display();
		}
	
	 }

  
}
