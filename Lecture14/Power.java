package Lecture14;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		System.out.println(pow(a,b));
	}
	private static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
		
		int sp=pow(a, b-1);
		int bp=sp*a;
		
		return bp;
	}
}
