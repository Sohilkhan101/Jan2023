package Lecture35;

import java.util.*;

public class Map_Demo {
	public static void main(String[] args) {
 
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ankit", 100);
		map.put("Rahul", 200);
		map.put("Riya", 150);
		map.put("Ram", 300);
//		map.put(null, 100);
		map.put("Sam", 500);
		map.put("Ram", 3000);
		
		System.out.println(map);
//
//		//get put remove containsKey = O(1)
//		
//		 System.out.println(map.remove("abc"));
//		 System.out.println(map.containsKey("abc"));
////		 
//		 System.out.println(map.remove("Sam"));
//		 System.out.println(map.containsKey("Ram"));
//		 System.out.println(map);
//		 System.out.println(map.get("abc"));
		 
		 
		 //TreeMap
		 TreeMap<String, Integer> map1 = new TreeMap<>();
		 	map1.put("Sam", 500);
			map1.put("Ankit", 100);
			map1.put("Rahul", 200);
			map1.put("Riya", 150);
			map1.put("Ram", 300);
			

			
//			System.out.println(map1);

			//get put remove containsKey = O(logn)
			
//			 System.out.println(map1.remove("abc"));
//			 System.out.println(map1.containsKey("abc"));
////			 
//			 System.out.println(map1.remove("Sam"));
//			 System.out.println(map1.containsKey("Ram"));
//			 System.out.println(map1);
//			 System.out.println(map1.get("abc"));
		 
			 // LinkedHashMap
			 LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
				map2.put("Ankit", 100);
				map2.put("Rahul", 200);
				map2.put("Riya", 150);
				map2.put("Ram", 300);
				map2.put("Sam", 500);
				map2.put(null, 500);

//				System.out.println(map2);

				
//				 System.out.println(map2.remove("abc"));
//				 System.out.println(map2.containsKey("abc"));
//				 
//				 System.out.println(map2.remove("Sam"));
//				 System.out.println(map2.containsKey("Ram"));
//				 System.out.println(map2);
//				 System.out.println(map2.get("abc"));
				
				
				
				
//				Printing
				
//				Way1
				Set<String>set= map.keySet();
				System.out.println(set);
				for(String k:set) {
					System.out.println(k +": "+map.get(k));
				}
				
				System.out.println();
				
//				way2
				
				for(String k:map.keySet()) {
					System.out.println(k +": "+map.get(k));
				}
////				
//				System.out.println();
				
//				way3
				
//				ArrayList<String>list= new ArrayList<>(map.keySet());
//				
//				for(String k:list) {
//					System.out.println(k +": "+map.get(k));
//				}
				
				
				
				
	}
}
