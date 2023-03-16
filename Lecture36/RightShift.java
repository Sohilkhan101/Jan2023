package Lecture36;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		n>>=2;     // n=n>>2;
		System.out.println(n);
		
		n=-11;
		n=n>>1;
		System.out.println(n);

		n=11;
		n=n<<2;
		System.out.println(n);
		
		n=-11;
		n=n<<2;
		System.out.println(n);
	}

}
