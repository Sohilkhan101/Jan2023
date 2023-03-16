package Lecture35;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int arr[]=intersection(nums1,nums2);
		for(int k:arr) {
			System.out.print(k+" ");
		}
		
	}
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 
		 ArrayList<Integer>list= new ArrayList<>();
		 HashMap<Integer, Integer>map = new HashMap<>();
		 
		 for(int k:nums1) {
			 if(map.containsKey(k)) {
				 map.put(k, map.get(k)+1);
			 }else {
				 map.put(k,1);
			 }
		 }
		 
		 for(int k:nums2) {
			 if(map.containsKey(k) && map.get(k)>0) {
				 list.add(k);
				 map.put(k, 0);
			 }
		 }
		
		 int [] ans= new int [list.size()];
		 for(int i=0;i<list.size();i++) {
			 ans[i]=list.get(i);
		 }
		 
		return ans;      
	    }

}
