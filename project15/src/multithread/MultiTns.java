package multithread;
import java.io.*;
import java.util.*;
public class MultiTns extends Thread {
	String str;
	int time;
	MultiTns(String s, int t){
		str = s;
		time = t;
	} public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(time);
			} catch(InterruptedException e) {
				System.out.println("Interrupted Exception");
			}
		}
	}
	public static void main(String[] args) {
		MultiTns t1 = new MultiTns ("Good Morning",4);
		MultiTns t2 = new MultiTns ("Hello", 5);
		MultiTns t3 = new MultiTns ("Welcome",6 );
		MultiTns t4 = new MultiTns ("Thankyou",7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	}
