package Lecture31;

public class Delete {
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
	    public TreeNode deleteNode(TreeNode root, int key) {
	        if(root==null){
	        return null;
	        }
	        if(key > root.val){
	        root.right = deleteNode(root.right, key)  ; 
	        }else if(key < root.val){
	        root.left  = deleteNode(root.left, key) ;
	        }else{
	            // 1||0
	            if(root.left==null) return root.right;
	            else if(root.right==null)return root.left;
	            else{
	                int lmax=find(root.left);
	                root.left = deleteNode(root.left,lmax);
	                root.val=lmax;
	            }
	        }
	      return root; 
	    }

	    public static int find(TreeNode root){
	        if(root==null){
	            return Integer.MIN_VALUE;
	        }
	        int slf=root.val;
	        int r=find(root.right);
	        return Math.max(r,slf);
	    }
	}
}
