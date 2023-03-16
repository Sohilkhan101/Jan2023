package Lecture36;

public class SingalNumberIII {

	public static void main(String[] args) {
		
		int [] arr = {2,3,4,2,3,4,5,15};
		
		int ans=0;
		for(int k:arr) {
			ans=ans^k;
		}
//		System.out.println(ans);
		
		int mask=ans&(~(ans-1));
		
		int a=0;
		for(int k:arr) {
			if((k&mask)!=0) {
				a=a^k;
			}
		}
		System.out.println(a);
		System.out.println(ans^a);
		
		
	}

}
