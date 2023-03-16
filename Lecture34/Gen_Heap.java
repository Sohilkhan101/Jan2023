package Lecture34;

import java.util.*;

public class Gen_Heap <T extends Comparable<T>> {
	ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		data.add(item);
		upheapyfy(data.size() - 1);
	}

	private void upheapyfy(int ci) {

		int pi = (ci - 1) / 2;

		T cv = data.get(ci);
		T pv = data.get(pi);
		if (compare(cv, pv)<0) {
			swap(ci, pi);
			upheapyfy(pi);

		}
	}

	private void swap(int ci, int pi) {
		T cv = data.get(ci);
		T pv = data.get(pi);
		data.set(pi, cv);
		data.set(ci, pv);
	}

	public T remove() {
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapyfy(0);
		return rv;
	}
	private void downheapyfy(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;

		if (lci < data.size() && compare(data.get(lci) , data.get(mini)) < 0 ) {
			mini = lci;
		}
		if (rci < data.size() && compare(data.get(rci) , data.get(mini)) < 0  ) {
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
	
	public int compare(T o1 , T o2) {
		return o1.compareTo(o2);
	}

	
	
}
