package Lecture34;

import java.util.PriorityQueue;

public class Min_Pair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,6,2,8,3,9,7};
		
		PriorityQueue<Integer>pq= new PriorityQueue<>();
		
		for(int k : arr) {
			pq.add(k);
		}
		
		while(pq.size()!=1) {
			System.out.println(pq);
			int a=pq.poll();
			int b=pq.poll();
			pq.add(a+b);

		}
		System.out.println(pq.poll());

	}

}
