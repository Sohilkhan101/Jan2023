package Lecture23;

public class StudentClient {
	public static void main(String[] args) {
		Student s = new Student();
		s.age = 20;
		s.name = "Hardik";

		Student s1 = new Student();
		s1.age = 18;
		s1.name = "Ravi";

		System.out.println(s.name + " " + s.age);
		System.out.println(s1.name + " " + s1.age);
		
		int my_age = 20;
		String my_name = "C";
//		test(s,s1);
//		test2(s,s1);
		Test3(s, s1.age, s1.name, my_age, my_name);
		
		System.out.println(s.name + " " + s.age);
		System.out.println(s1.name + " " + s1.age);

	}

	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

//	private static void test2(Student s, Student s1) {
//		// TODO Auto-generated method stub
//
//		s1 = new Student();
//		int temp = s1.age;
//		s1.age = s.age;
//		s.age = temp;
//
//		s = new Student();
//		String temp1 = s1.name;
//		s1.name = s.name;
//		s.name = temp1;
//	}

//	private static void test(Student s, Student s1) {
//		// TODO Auto-generated method stub
//		Student k = s;
//		s = s1;
//		s1 = k;
//	}

}
