package collections;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList <String> ll1 = new LinkedList <String>();
		System.out.println("Initial list of elements:"+ll1);
		ll1.add("karthik");
		ll1.add("bhanu");
		System.out.println("list after adding elements:"+ll1); 
		LinkedList <String> ll2 = new LinkedList<String> ();
		ll2.add("emma");
		ll2.add("jennifer");
		ll1.addAll(1,ll2);
		System.out.println("After add all() method:"+ll1);
		ll1.removeFirst();
		System.out.println("List after removefirst():"+ll1);
		ll1.removeLast();
		System.out.println("List after removelast():"+ll1);
		ll1.clear();
		System.out.println("list after clear():"+ll1);

		
		
	}


}
