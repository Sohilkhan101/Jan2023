package Lecture37;

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
			System.out.println(k + " " + map.get(k));
		}
	}

	public boolean HasPath(int src, int dst) {

		return HasPath(src, dst, new HashSet<>());
	}

	public boolean HasPath(int src, int dst, HashSet<Integer> visited) {

		if (src == dst) {
			return true;
		}
		visited.add(src);

		for (int k : map.get(src).keySet()) {
			if (!visited.contains(k)) {
				boolean ans = HasPath(k, dst, visited);
				if (ans) {
					return true;
				}
			}
		}

		visited.remove(src);

		return false;
	}

	public void PrintAllPath(int src, int dst) {
		String ans = src + " ";

		PrintAllPath(src, dst, new HashSet<>(), ans);
	}

	public void PrintAllPath(int src, int dst, HashSet<Integer> visited, String ans) {

		if (src == dst) {
			System.out.println(ans);
			return;
		}
		visited.add(src);

		for (int k : map.get(src).keySet()) {
			if (!visited.contains(k)) {
				PrintAllPath(k, dst, visited, ans + k + " ");

			}
		}

		visited.remove(src);

		return;
	}

	public boolean BFS(int src, int dst) {

		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// Remove
			int rv = q.remove();
			// Ignore
			if (visited.contains(rv)) {
				continue;
			}
			// Mark Visited

			visited.add(rv);
			if (rv == dst) {
				return true;
			}
			// Add Nbrs
			for (int k : map.get(rv).keySet()) {
				if (!visited.contains(k)) {
					q.add(k);
				}
			}
		}
		return false;

	}

	public boolean DFS(int src, int dst) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.add(src);
		while (!st.isEmpty()) {
			// Remove
			int rv = st.pop();
			// Ignore
			if (visited.contains(rv)) {
				continue;
			}
			// Mark Visited
			visited.add(rv);
			if (rv == dst) {
				return true;
			}
			// Add Nbrs
			for (int k : map.get(rv).keySet()) {
				if (!visited.contains(k)) {
					st.add(k);
				}
			}
		}
		return false;
	}

	public boolean isCycle() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {

				// Remove
				int rv = q.remove();

				// Return True
				if (visited.contains(rv)) {
					return true;
				}
				// Mark Visited
				visited.add(rv);

				// Add Nbrs
				for (int k : map.get(rv).keySet()) {
					if (!visited.contains(k)) {
						q.add(k);
					}
				}
			}
		}
		return false;

	}
}
