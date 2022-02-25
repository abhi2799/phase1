package singlelinked;

import java.util.LinkedList;

public class singlelist {
	public static void main(String[] args) {
		LinkedList <String> ll1 = new LinkedList <String>();
		System.out.println("Initial list of elements:"+ll1);
		ll1.add("karthik");
		ll1.add("bhanu");
		System.out.println("list after adding elements:"+ll1); 
		ll1.add(1,"adi");
		ll1.add(2,"vinay");
		System.out.println("list after add(i,e)method:"+ll1);
		ll1.addFirst("tarun");
		System.out.println("list after add first element:"+ll1);
		ll1.addLast("nithin");
		System.out.println("list after add last element:"+ll1);
		ll1.remove("bhanu");
		System.out.println("after remove method:" +ll1);
		ll1.remove(1);
		System.out.println("Remove element using index:"+ll1);
		LinkedList <String> ll2 = new LinkedList <String> ();
		ll2.add("rose");
		ll2.add("scarlett");
		ll1.addAll(ll2);
		System.out.println("Updated list:"+ll1);
		ll1.removeAll(ll2);
		System.out.println("After removing all() method:"+ll1);
		LinkedList <String> ll3 = new LinkedList<String> ();
		ll3.add("emma");
		ll3.add("jennifer");
		ll1.addAll(1,ll3);
		System.out.println("After add all() method:"+ll1);
		ll1.removeFirst();
		System.out.println("List after removefirst():"+ll1);
		ll1.removeLast();
		System.out.println("List after removelast():"+ll1);
		ll1.clear();
		System.out.println("list after clear():"+ll1);
	}



}
