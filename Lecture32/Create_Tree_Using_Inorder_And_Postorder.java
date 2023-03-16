package Lecture32;

import java.util.*;

public class Create_Tree_Using_Inorder_And_Postorder {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	private TreeNode root ;

	
		public Create_Tree_Using_Inorder_And_Postorder(int[] inorder, int[] preorder) {
			root=CreateTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);

	}

		private TreeNode CreateTree(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}

			TreeNode node = new TreeNode(preorder[plo]);
			int i = Sreach(inorder, preorder[plo], ilo, ihi);
			int net = i - ilo;
			node.left = CreateTree(preorder, inorder, ilo, i - 1, plo + 1, plo + net);
			node.right = CreateTree(preorder, inorder, i + 1, ihi, plo + net + 1, phi);
			return node;
		}

		private int Sreach(int[] inorder, int item, int si, int ei) {
			// TODO Auto-generated method stub

			for (int i = si; i <= ei; i++) {
				if (inorder[i] == item) {
					return i;
				}
			}
			return 0;
		}
		
		
		public void display() {
			display(this.root);
		}
		
		
		private void display(TreeNode root) {
			
			if(root==null) {
				return ;
			}
			System.out.println(root.val);
			display(root.left);
			display(root.right);
			
			
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int n= sc.nextInt();
			
			int [] preorder=new int [n];
			for(int i=0;i<n;i++) {
				preorder[i]=sc.nextInt();
			}
			
			
			int m= sc.nextInt();
			int [] inorder = new int[m];
			for(int i=0;i<m;i++) {
				inorder[i]=sc.nextInt();
			}
			
			Create_Tree_Using_Inorder_And_Postorder t = new Create_Tree_Using_Inorder_And_Postorder(inorder , preorder);
			t.display();
			sc.close();
		}
	

}