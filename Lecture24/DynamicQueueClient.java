package Lecture24;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue q= new DynamicQueue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		
		System.out.println(q.Size());
		q.Display();
		
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		
		System.out.println(q.Size());
		q.Display();
		
		q.Enqueue(50);
		q.Enqueue(60);
		q.Enqueue(70);
		q.Enqueue(80);
		q.Display();
		System.out.println(q.Dequeue());
		System.out.println(q.Size());
		q.Display();

	}

}
