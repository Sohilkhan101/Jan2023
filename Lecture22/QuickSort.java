package Lecture22;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {3,1,7,5,4};
		quickSort(arr,0,arr.length-1);
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

	private static void quickSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return;
		}
		int pi=findpivot(arr,si,ei);
		quickSort(arr, si, pi-1);
		quickSort(arr, pi+1, ei);
		
	}

	private static int findpivot(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		
		int pivot=arr[ei];
		int pi=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<=pivot) {
				int t=arr[i];
				arr[i]=arr[pi];
				arr[pi]=t;
				pi++;
			}
		}
		
		int t=arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=t;
		
		return pi;
	}

}
