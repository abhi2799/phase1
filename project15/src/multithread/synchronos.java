package multithread;
import java.io.*;
import java.util.*;
class Table {
	void printTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+"x"+i+"="+(n*i));
			try {
				Thread.sleep(400);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t) {
		this.t=t;
	} public void run() {
		synchronized(t) {
			t.printTable(4);
		}
	}
} class MyThread2 extends Thread {
	Table t;
	MyThread2(Table t) {
		this.t=t;
	} public void run() {
		synchronized(t) {
			t.printTable(5);
		}
	}
}
public class synchronos {
	public static void main(String a[]) {
		Table tb1 = new Table();
		MyThread1 t1 = new MyThread1(tb1);
		MyThread2 t2 = new MyThread2(tb1);
		t1.start();
		t2.start();
	}
}
