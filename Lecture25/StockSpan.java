package Lecture25;

import java.util.*;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 10, 12, 4, 15, 8, 9 };
//		              [1, 2, 3, 1, 5, 1, 2]
		stockspan(arr);
	}

	private static void stockspan(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] >= arr[ st.peek()]) {
				st.pop();
			}

			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}
			st.push(i);

		}
		System.out.println(Arrays.toString(ans));

	}

}
