package Lecture23;

public class Stack {
	
	public int []data;
	protected int tos= -1;
	
	public Stack() {
		data=new int[5];
	}
	public Stack(int size) {
		data=new int[size];
	}
	
	public boolean isEmpty() {
		return tos==-1;
	}
	public boolean isFull() {
		return tos==data.length-1;
	}
	public int Size() {
		return tos+1;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new  Exception ("Stack is Empty");
		}
		return data[tos];
	}
	
	public void push(int val) throws Exception {
		if(isFull()) {
			throw new  Exception ("Stack is Full");
		}
		tos=tos+1;
		data[tos]=val;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new  Exception ("Stack is Empty");
		}
		int val=data[tos];
		tos--;
		return val;
	}
	
	public void Display() throws Exception {
		if(isEmpty()) {
			throw new  Exception ("Stack is Empty");
		}
		for(int i=0;i<=tos;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
}
