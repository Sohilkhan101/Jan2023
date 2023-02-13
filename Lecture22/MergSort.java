package Lecture22;

public class MergSort {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 5, 2 };
		int p[] = mergSort(arr, 0, arr.length - 1);
		for(int k :p) {
			System.out.print(k+" ");
		}
	}

	private static int[] mergSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub

		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}

		int mid = (si + ei) / 2;

		int[] fa = mergSort(arr, si, mid);
		int[] sa = mergSort(arr, mid + 1, ei);

		return mergTwoSortedArrays(fa, sa);

	}

	private static int[] mergTwoSortedArrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length + brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr.length && j < brr.length) {

			if (arr[i] < brr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = brr[j];
				j++;
				k++;
			}
		}

		while (i < arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}

		while (j < brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}

		return ans;
	}

}
