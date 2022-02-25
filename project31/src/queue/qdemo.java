package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class qdemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < 5; i++)
			q.add(i);
		System.out.println("Elements of queue" + q);
		int removedele = q.remove();
		System.out.println("removed elements-" + removedele);
		System.out.println(q);
		int head = q.peek();
		System.out.println("head of queue" + head);
		 int size= q.size();
		System.out.println("size of queue- " + size);
	}

	}

