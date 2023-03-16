package Lecture37;

public class Graph_Client {
	public static void main(String[] args) {
		Graph g= new Graph();
		
		g.addedge(1, 2, 3);
		g.addedge(1,4,2);
		g.addedge(2,3,9);
		g.addedge(3,4,4);
		g.addedge(4, 5, 11);
		g.addedge(5, 6, 16);
		g.addedge(5, 7, 14);
		g.addedge(6, 7, 19);
		g.display();
//		System.out.println(g.noofedge());
//		g.removeedge(4, 5);
//		System.out.println(g.noofedge());
//		g.display();
//		g.addedge(4, 5, 11);
//		g.display();
//		g.removevertex(1);
//		g.display();
//		System.out.println(g.noofedge());
//		System.out.println(g.HasPath(1, 6));
//		g.PrintAllPath(1, 6);
//		g.removeedge(4, 5);
//		System.out.println(g.BFS(1, 6));
//		g.removeedge(2, 3);
//		g.removeedge(5, 6);
//		System.out.println(g.isCycle());

	}

}
