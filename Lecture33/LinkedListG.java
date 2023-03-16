package Lecture33;

public class LinkedListG <T> {

	private class Node {
		T data;
		Node next;
	}
	Node head;
	Node tail;
	int size;

	public void addFirst(T item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(T item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			addFirst(item);
		} else {
			tail.next = nn;
			nn.next = null;
			size++;
			tail = nn;
		}
	}

	public void addAtIndex(int k, T item) {
		Node nn = new Node();
		nn.data = item;
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node temp = getNode(k-1);
			Node temp1 = temp.next;
			temp.next = nn;
			nn.next = temp1;
			size++;
		}
	}

	public Node getNode(int k) {
		// TODO Auto-generated method stub
		Node temp = head;
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		return temp ;
	}

	public T getFist() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		return head.data;
	}

	public T getLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		return tail.data;
	}

	public T getKth(int k) throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		return getNode(k).data;
	}

	public void removeFirst() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;

	}

	public void removeLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		Node temp = getNode(size - 1);
		temp.next = null;
		size--;
		tail = temp;

	}

	public void removeKth(int k) throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}

		Node temp = getNode(k - 1);
		Node temp1 = temp.next;
		temp.next = temp.next.next;
		temp1.next = null;
		size--;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int Size() {
		return size;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
}
