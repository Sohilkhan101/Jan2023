package Lecture36;

public class CountSetBits {
	public static void main(String[] args) {
		int n=9;
		int count=0;
		while(n!=0) {
			if((n&1)!=0) {
				count++;
			}
			n>>=1;
		}
		System.out.println(count);
		
		count=0;
		n=15;
		while(n!=0) {
			count++;
			n=n&(n-1);
		}
		System.out.println(count);
	}

}
