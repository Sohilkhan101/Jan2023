package Lecture25;

import java.util.*;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		reverse(q);
		System.out.println(q);
	}

	private static void reverse(Queue<Integer> q) {
		// TODO Auto-generated method stub
		if (q.isEmpty()) {
			return;
		}
		int item = q.remove();
		reverse(q);
		q.add(item);

	}

}
