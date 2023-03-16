package Lecture35;

import java.util.ArrayList;

public class Hashmap<k, v> {

	int size;

	public class Node {
		k key;
		v val;
		Node next;

		public Node(k key, v val) {
			this.key = key;
			this.val = val;
			this.next = null;
		}

		public Node() {

		}

	}

	ArrayList<Node> bucketarray;

	public Hashmap(int x) {
		bucketarray = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			this.bucketarray.add(null);
		}
	}

	public Hashmap() {
		this(4);
	}

	public void put(k key, v val) {
		int bn = hashfunction(key);

		Node temp = bucketarray.get(bn);

		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}

		temp = bucketarray.get(bn);
		Node nn = new Node(key, val);
		nn.next = temp;
		size++;
		bucketarray.set(bn, nn);
		double lf = (1.0 * this.size) / this.bucketarray.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> oba = this.bucketarray;// old bucket Array
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * oba.size(); i++) {
			nba.add(null);

		}
		this.bucketarray = nba;
		this.size = 0;

		for (Node temp : oba) {

			while (temp != null) {
				put(temp.key, temp.val);
			}

		}

	}

	public boolean contains(k key) {
		int bn = hashfunction(key);

		Node temp = bucketarray.get(bn);

		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public v get(k key) {
		int bn = hashfunction(key);

		Node temp = bucketarray.get(bn);

		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public v remove(k key) {
		int bn = hashfunction(key);
		Node head = bucketarray.get(bn);
		Node prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			prev = head;
			head = head.next;
		}

		if (head == null)
			return null;

		if (prev == null) {
			this.bucketarray.set(bn, head.next);
			head.next = null;
		} else {
			prev.next = head.next;
			head.next = null;
		}
		size--;
		return head.val;
	}

	private int hashfunction(k key) {
		int bn = key.hashCode() % this.bucketarray.size();
		if (bn < 0) {
			bn += this.bucketarray.size();
		}
		return bn;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node node : bucketarray) {
			while (node != null) {
				s = s + node.key + "=" + node.val + ", ";
				node = node.next;
			}
		}
		s = s + "}";
		return s;

	}

}
