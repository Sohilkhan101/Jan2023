package Lecture26;

public class LLClient {
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		System.out.println(ll.size);
		ll.display();
		 ll.removeFirst();
		ll.removeLast();
		ll.display();
		ll.removeKth(3);
		ll.display();
		
	}

}
