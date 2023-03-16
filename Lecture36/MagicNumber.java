
package Lecture36;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int ans=0;
		int mul=5;
		
		while(n!=0) {
			if((n&1)!=0) {
				ans+=mul;
			}
			mul*=5;
			n>>=1;
		}
		System.out.println(ans);

	}

}
