package Lecture21;

import java.util.ArrayList;

public class Subset {
	public static void main(String[] args) {
		int []arr= {1,2,3};
		ArrayList<Integer>list = new ArrayList<>();
		ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
		subsets(arr,0,list,ans);	
		System.out.println(ans);
	}

	private static void subsets(int[] arr, int idx, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		
//		System.out.println(list);
		ans.add(new ArrayList<>(list));
		
		for(int i=idx;i<arr.length;i++) {
			list.add(arr[i]);
			subsets(arr, i+1, list, ans);
			list.remove(list.size()-1);
		}
		
	}

}
