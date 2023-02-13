package Lecture24;

import Lecture23.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int val) throws Exception {
		if (isFull()) {
			int newarr[] = new int[2 * this.data.length];
			for (int i = 0; i < data.length; i++) {
				newarr[i] = data[i];
			}

			data = newarr;
		}
		super.push(val);
	}

}
