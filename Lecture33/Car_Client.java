package Lecture33;

import java.util.*;

public class Car_Client {

	public static void main(String[] args) {

		Car[] arr = new Car[5];

		arr[0] = new Car(2000, 10, "White");
		arr[1] = new Car(1000, 20, "Black");
		arr[2] = new Car(3550, 30, "Yellow");
		arr[3] = new Car(3400, 89, "Grey");
		arr[4] = new Car(1200, 60, "Red");
		
		Car.Display(arr);
		System.out.println("**** **** **** **** **** ****");
		
		// Comparable
//		Car.Sort(arr); 
		
		// Comparator
//		Car.Sort(arr, new CarComparatorColor());
		
		//Direct Method
		Arrays.sort(arr,new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
//				return o1.speed-o2.speed;
//				return o1.price-o2.price;
				return o1.color.compareTo(o2.color);
			}
		});
		
		Car.Display(arr);
		
	}
}
