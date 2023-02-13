package Lecture27;


public class SortList {
	private  static class  Node {
		private	int data;
		private	Node next;
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
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SortList ll = new SortList();
		ll.addLast(-1);
		ll.addLast(5);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(0);
		ll.display();
		MergSort(ll.head);
		ll.display();
	}
	
	private static Node MergSort(Node head) {
		if(head==null || head.next==null) return head;
		
		Node midNode = middleNode( head) ;
		Node midnext=midNode.next;
		midNode.next=null;
		Node l1=MergSort( head);
		Node l2=MergSort(midnext);
		return MergList(l1,l2);
	}

	public static Node MergList(Node list1, Node list2) {
		// TODO Auto-generated method stub
		Node k = new Node();
		Node temp = k;
		while (list1 != null && list2 != null) {
			if (list1.data < list2.data) {
				temp.next = list1;
				temp = temp.next;
				list1 = list1.next;
			} else {
				temp.next = list2;
				temp = temp.next;
				list2 = list2.next;
			}
		}

		if (list1 != null) {
			temp.next = list1;
		} else {
			temp.next = list2;
		}
		return k.next;

	}

	public static Node middleNode(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
}
}