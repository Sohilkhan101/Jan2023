package Lecture30;

public class Symmetric {
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
	class Solution {
	    public boolean isSymmetric(TreeNode root) {
	       return mirror(root.left,root.right); 
	    }

	    public static boolean mirror(TreeNode root1, TreeNode root2){

	        if(root1==null && root2==null){
	            return true;
	        }

	        if(root1==null || root2==null){
	            return false;
	        }

	        if(root1.val != root2.val){
	            return false;
	        }

	        boolean left=mirror(root1.left , root2.right);
	        boolean right=mirror(root1.right , root2.left);

	        return left && right;
	    }


	}

}
