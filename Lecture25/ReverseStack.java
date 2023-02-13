package Lecture25;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer>st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}

	private static void reverse(Stack<Integer> st) {
		if(st.isEmpty())
			return;
		int item=st.pop();
		reverse(st);
		InsertBottom(st,item);
	}
	private static void InsertBottom(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int k=st.pop();
		InsertBottom(st, item);
		st.push(k);
	}

}
