package Lecture33;

public interface Inter_3 extends Inter_I,Inter_2{
	
	public void push();
	public int pop();
	public int size();
	
	int val=9;// public static final 
	
	public static void Sayhey1() {
		System.out.println("hey");
	}
	default void Sayhey2() {
		System.out.println("hey");
	}
//	private int fun65() {
//		return 9;
//	}
}