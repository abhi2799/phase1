package thread;
import java.io.*;
public class MyThread implements Runnable{
	String name;
	Thread t;
	MyThread(String n)  {
		name = n;
		t= new Thread(this,name);
		t.start();
	}
	public void run() {
		System.out.println(name + " thread is running....");
	}
	public static void main(String args[]) {
		new MyThread("Child");
	}
}


