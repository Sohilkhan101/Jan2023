package Lecture23;

public class Queue {
	 protected int[] data;
	 protected int front;
	 protected int size;

	public Queue() {
		data = new int[5];
		front = 0;
		size = 0;
	}

	public Queue(int size) {
		data = new int[size];
		front = 0;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == data.length;
	}

	public int Size() {
		return size;
	}

	public void Enqueue(int val) throws Exception {
		if (isfull()) {
			throw new Exception("Queue is Full");
		}

		int idx = (front + size) % data.length;
		data[idx] = val;
		size++;
	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int val = data[front];
		front = (front + 1) % data.length;
		size--;
		return val;
	}
	
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx=(front+i)%data.length;
			System.out.print(data[idx]+" ");
		}
		System.out.println();
		
	}

}
