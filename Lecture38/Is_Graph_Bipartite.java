package Lecture38;

import java.util.HashMap;
import java.util.LinkedList;

public class Is_Graph_Bipartite {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Is_Graph_Bipartite(int n) {
		map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addedge(int [][] edge) {
		
		for (int i = 0; i < edge.length; i++) {
			for(int j:edge[i]) {
				map.get(i).put(j, 1);
			}
		}
	}
	public void display() {
		for (int k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}
	}
	
	public class pair {
		int vtx;
		int h;
		public pair(int vtx , int h) {
			this.vtx=vtx;
			this.h=h;
		}
	}
	
	
	public boolean isBp() {
		LinkedList<pair> qq = new LinkedList<>();
		HashMap<Integer , Integer> visited = new HashMap<>();

		for (int src : map.keySet()) {
			if (visited.containsKey(src)) {
				continue;
			}
			pair s=new pair(src,0);
			qq.add(s);
			while (!qq.isEmpty()) {
				
				pair r = qq.remove();
				
				if (visited.containsKey(r.vtx) && r.h != visited.get(r.vtx) ) {
					return false;
				}
				
				visited.put(r.vtx , r.h);
				
				for (int k : map.get(r.vtx).keySet()) {
					if (!visited.containsKey(k)) {
						pair p = new pair(k,r.h+1);
						qq.add(p);
					}
				}

			}
		}

		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		int n=4;
		Is_Graph_Bipartite bp = new Is_Graph_Bipartite(n);
		
		int [][] arr= {{1,3},{0,2},{1,3},{0,2}};
		bp.addedge(arr);
		System.out.println(bp.isBp());
		bp.display();
		
	}

}
