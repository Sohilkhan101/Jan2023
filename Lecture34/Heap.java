package Lecture34;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);
		upheapyfy(data.size() - 1);
	}

	private void upheapyfy(int ci) {

		int pi = (ci - 1) / 2;

		int cv = data.get(ci);
		int pv = data.get(pi);
		if (cv < pv) {
			swap(ci, pi);
			upheapyfy(pi);

		}
	}

	private void swap(int ci, int pi) {
		int cv = data.get(ci);
		int pv = data.get(pi);
		data.set(pi, cv);
		data.set(ci, pv);
	}

	public int remove() {
		swap(0, data.size() - 1);
		int rv = data.remove(data.size() - 1);
		downheapyfy(0);
		return rv;
	}
	private void downheapyfy(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;

		if (lci < data.size() && data.get(lci) < data.get(mini)) {
			mini = lci;
		}
		if (rci < data.size() && data.get(rci) < data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapyfy(mini);
		}

	}
	
	public void display() {
		System.out.println(this.data);
	}
	public void min() {
		System.out.println(this.data.get(0));
	}
	public void size() {
		System.out.println(this.data.size());
	}
}
