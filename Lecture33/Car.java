package Lecture33;

import java.util.*;

public class Car implements Comparable<Car> {
	int price;
	int speed;
	String color;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C:" + this.color;

	}

	@Override
	public int compareTo(Car o) {
//		return this.color.compareTo(o.color);
//		return o.price - this.price;
		return this.speed - o.speed;

	}

	public static void Display(Car[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		for (int Pass = 1; Pass < arr.length; Pass++) {
//			for (int i = 0; i < arr.length - Pass; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T t = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = t;
//				}
//
//			}
//
//		}
//
//	}
	
	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int turn = 1; turn < arr.length; turn++) {

			for (int i = 0; i < arr.length - turn; i++) {// 6-1
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}

	}

}
