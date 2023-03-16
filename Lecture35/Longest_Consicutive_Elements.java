package Lecture35;

import java.util.HashMap;

public class Longest_Consicutive_Elements {

	public static void main(String[] args) {
		int[] arr = { 20, 18, 5, 4, 3, 8, 9, 10, 2, 4, 1, 16, 17, 22 };
		System.out.println(count(arr));

	}

	public static int count(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}
			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}

		}
		int ans = 0;

		for (int key : map.keySet()) {
			if (map.get(key)) {
				int count = 0;
				while (map.containsKey(key)) {
					count++;
					key++;
				}
				ans = Math.max(ans, count);
			}

		}
		return ans;

	}

}
