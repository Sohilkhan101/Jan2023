package Lecture36;

public class Subsequence {
	public static void main(String[] args) {
		String s="abcd";
		
		int total_Susequences = 1<<s.length() ;
//		System.out.println(total_Susequences);
		for(int i=0;i<total_Susequences;i++) {
			
			int pos=0;
			int n=i;
			while(n!=0) {
				if((n&1)!=0) {
					System.out.print(s.charAt(pos));
				}
				pos++;
				n>>=1;
			}
			System.out.println();
		}
	}

}
