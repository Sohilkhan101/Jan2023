package Lecture36;

public class SingalNumberI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,3,4,2,3,4,5};
		int ans=0;
		for(int k:arr) {
			ans=ans^k;
		}
		System.out.println(ans);

	}

}
