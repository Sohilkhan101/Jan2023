package Lecture23;

public class StackClient {
	public static void main(String[] args) throws Exception {
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.Display();
		System.out.println(s.pop());
		s.Display();
		System.out.println(s.peek());
		System.out.println(s.Size());
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());

	}

}
