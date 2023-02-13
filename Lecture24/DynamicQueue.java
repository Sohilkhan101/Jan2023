package Lecture24;

import Lecture23.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void Enqueue(int val) throws Exception {
		if (isfull()) {
			int [] newarr= new int [2* data.length];
			for(int i=0;i<size;i++) {
				int idx=(front+i)%data.length;
				newarr[i]=data[idx];
			}
			front=0;
			data=newarr;
			
		}
		super.Enqueue(val);

	}
	
}
