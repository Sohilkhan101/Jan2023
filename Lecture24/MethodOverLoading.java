package Lecture24;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(1,2);
		Add(1,2,3);
		Add(1,2,3.3);

	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b + c;
	}

	public static int Add(int a, int b, double c) {
		return (int) ((int) a + b + c);
	}

}
