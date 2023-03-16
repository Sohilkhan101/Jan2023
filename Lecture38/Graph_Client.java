package Lecture38;

import java.util.Collections;
import java.util.PriorityQueue;

public class Graph_Client {
	public static void main(String[] args) {
		PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
		pq.remove();
		pq.isEmpty();
		Graph g = new Graph();

		g.addedge(1, 2, 3);
		g.addedge(1, 4, 2);
		g.addedge(2, 3, 9);
		g.addedge(3, 4, 4);
		g.addedge(4, 5, 1);
		g.addedge(5, 6, 6);
		g.addedge(5, 7, 4);
		g.addedge(6, 7, 9);
		g.display();
		g.removeedge(4, 5);
		System.out.println(g.isConneted());


	}
}
