package Lecture35;

import java.util.*;

public class Set_Demo {
	public static void main(String[] args) {
		
		HashSet<Integer>set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(40);
		set.add(90);
		set.add(60);
//		System.out.println(set);
		
		TreeSet<Integer>set1 = new TreeSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		set1.add(90);
		set1.add(60);
//		System.out.println(set1);
		
		LinkedHashSet<Integer>set2 = new LinkedHashSet<>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(30);
		set2.add(40);
		set2.add(90);
		set2.add(60);
		System.out.println(set2);

	}

}
