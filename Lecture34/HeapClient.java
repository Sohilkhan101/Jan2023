package Lecture34;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h= new Heap();
		h.add(10);
		h.add(20);
		h.add(3);
		h.add(5);
		h.add(70);
		h.add(90);
		h.add(-10);
		h.size();
		h.display();
		h.remove();
//		h.remove();
		h.size();
		h.display();

	}

}
