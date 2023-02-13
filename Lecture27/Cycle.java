package Lecture27;


public class Cycle {
	private static class Node {
		private int data;
		private Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int item) {
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

	public void addLast(int item) {
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

	public void createCycle() {
		this.tail.next = this.head.next.next;
	}

	public Node isCycle() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return fast;
			}
		}
		return null;

	}

	public void removeCycle1() {

		Node meetup = isCycle();
		if (meetup == null)
			return;
		Node slow = head;
		Node temp = meetup;
		while (slow != null) {
			temp = meetup;
			while (temp.next != meetup) {
				if ( temp.next == slow) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			slow = slow.next;
		}
	}

	public void removeCycle2() {
		Node meetup = isCycle();
		if (meetup == null)
			return;

		int count = 1;
		Node temp = meetup;
		while (temp.next != meetup) {
			count++;
			temp = temp.next;
		}
		// m step ahead
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	
	public void fylodcycleremoval() {
		Node meetup = isCycle();
		if (meetup == null) {
			return;
		}
		Node fast = meetup;
		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		Cycle ll = new Cycle();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.display();
		ll.createCycle();
//		ll.removeCycle1();
//		ll.removeCycle2();
		ll.fylodcycleremoval();
		ll.display();
	}

}