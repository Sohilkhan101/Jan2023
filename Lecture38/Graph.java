package Lecture38;

import java.util.*;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph() {
		map = new HashMap<>();
	}

	public void addedge(int v1, int v2, int cost) {
		if (map.get(v1) == null) {
			map.put(v1, new HashMap<>());
		}
		if (map.get(v2) == null) {
			map.put(v2, new HashMap<>());
		}
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void addvertex(int v) {
		if (!map.containsKey(v)) {
			map.put(v, new HashMap<>());
		}

	}

	public void removevertex(int v) {
		for (int k : map.keySet()) {
			map.get(k).remove(v);
		}
		map.remove(v);

	}

	public int noofedge() {
		int size = 0;
		for (int k : map.keySet()) {
			size += map.get(k).size();
		}

		return size / 2;
	}

	public void removeedge(int v1, int v2) {
		if (containsedge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	public boolean containsedge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean containsvertex(int v) {
		return map.containsKey(v);
	}

	public void display() {
		for (int k : map.keySet()) {
			System.out.println(k + " --> " + map.get(k));
		}
	}

	public void BFT() {

		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// Visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// add nbrs
				for (int k : map.get(r).keySet()) {
					if (!visited.contains(k)) {
						qq.add(k);
					}
				}

			}

		}

	}

	public void DFT() {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int r = st.pop();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// add nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}

	}

	public boolean isConneted() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);

				// Add nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return count == 1;

	}

}