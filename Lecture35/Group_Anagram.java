package Lecture35;

import java.util.*;

public class Group_Anagram {

	public static void main(String[] args) {
		String[] strs = {"bdddddddddd","bbbbbbbbbbc" };

		
		List<List<String>>list=groupAnagrams(strs);
		System.out.println(list);

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>>list= new ArrayList<>();
		
		HashMap<String , List<String>>map=new HashMap<>();
		
		for(String s: strs) {
			String key=GenerateKey(s);
			System.out.println(key);
			if(map.containsKey(key)) {
				map.get(key).add(s);
			}else {
				List<String>li= new ArrayList<>();
				li.add(s);
				map.put(key, li);	
			}
		}
		
		for(String k:map.keySet()) {
			list.add(map.get(k));
		}
		
		return list;
	}

	private static String GenerateKey(String s) {
		// TODO Auto-generated method stub
		
		int [] arr= new int [26];
		
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			arr[ch-'a']=arr[ch-'a']+1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int k:arr) {
			sb.append(k+",");
		}
		System.out.println(sb);
		
		return Arrays.toString(arr);
	}

}
