package Lecture31;

public class VaidateBST {
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
        public static class pair{
            boolean isbal=true;
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
        }
        public boolean isValidBST(TreeNode root) {
            return  valid(root).isbal;
        }
        public static pair valid(TreeNode root){
        if(root==null){
            return new pair();
        }

        pair lp=valid(root.left);
        pair rp=valid(root.right);

        pair slf = new pair();

        if(root.val>lp.max   && root.val < rp.min && lp.isbal && rp.isbal){
            slf.isbal=true;
            slf.min=Math.min(root.val,Math.min(lp.min , rp.min));
            slf.max=Math.max(root.val,Math.max(lp.max , rp.max));
        }
        else{
            slf.isbal=false;
        }

        return slf;

    }
}
}
