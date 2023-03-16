package Lecture38;

import java.util.*;

public class Kuruskals_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kuruskals_Algo(int n) {
		map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class edgePair {
		int v1;
		int v2;
		int cost;

		public edgePair() {

		}

		public edgePair(int v1, int v2, int cost) {
			this.cost = cost;
			this.v1 = v1;
			this.v2 = v2;
		}

		@Override
		public String toString() {
			return v1 + " " + v2 + " " + cost;
		}

	}

	public ArrayList<edgePair> alledgePair() {

		ArrayList<edgePair> list = new ArrayList<>();

		for (int k : map.keySet()) {
			for (int n : map.get(k).keySet()) {
				int v1 = k;
				int v2 = n;
				int cost = map.get(k).get(n);
				edgePair e = new edgePair(v1, v2, cost);
				list.add(e);
			}
		}

		return list;

	}

	public void kuruskal() {
		int ans = 0;
		DisjointSet d = new DisjointSet();
		for (int k : map.keySet()) {
			d.creat(k);
		}

		ArrayList<edgePair> list = alledgePair();

		Collections.sort(list, new Comparator<edgePair>() {

			@Override
			public int compare(edgePair o1, edgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});

		for (edgePair k : list) {
			int v1 = k.v1;
			int v2 = k.v2;
			
			int re1 = d.find(v1);
			int re2 = d.find(v2);

			if (re1 == re2) {

			} else {
				System.out.println(k);
				ans += k.cost;
				d.union(v1, v2);
			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
		Kuruskals_Algo k = new Kuruskals_Algo(7);
		k.addedge(1, 2, 1);
		k.addedge(2, 3, 6);
		k.addedge(3, 4, 2);
		k.addedge(4, 1, 7);
		k.addedge(4, 5, 8);
		k.addedge(5, 6, 3);
		k.addedge(6, 7, 8);
		k.addedge(5, 7, 4);
		k.kuruskal();

	}

}
