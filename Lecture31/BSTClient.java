package Lecture31;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,7,8,9,10,12,15,16};
		BST b= new BST(arr);
		b.preOurder();
		System.out.println(b.search(12));

	}

}
