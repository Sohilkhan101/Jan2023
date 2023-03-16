//package Lecture32;
//
//import java.util.Scanner;
//
//public class Client {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int n= sc.nextInt();
//		
//		int [] preorder=new int [n];
//		for(int i=0;i<n;i++) {
//			preorder[i]=sc.nextInt();
//		}
//		
//		
//		int m= sc.nextInt();
//		int [] inorder = new int[m];
//		for(int i=0;i<m;i++) {
//			inorder[i]=sc.nextInt();
//		}
//		
//		Create_Tree_Using_Inorder_And_Postorder t = new Create_Tree_Using_Inorder_And_Postorder(inorder , preorder);
//		t.display();
//	}
//
//}
