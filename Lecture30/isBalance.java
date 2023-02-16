package Lecture30;

public class isBalance {

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

		public class pair {
			boolean isbal = true;
			int h = -1;
		}
		public boolean isBalanced(TreeNode root) {
			return balance(root).isbal;
		}
		private pair balance(TreeNode root) {
			if (root == null) {
				return new pair();
			}
			pair lp = balance(root.left);
			pair rp = balance(root.right);
			
			pair slfp = new pair();
			slfp.h = Math.max(lp.h, rp.h) + 1;
			
			int bf = Math.abs(lp.h - rp.h);
			slfp.isbal = (bf <= 1 && lp.isbal && rp.isbal);
			
			return slfp;
		}
	}
}
