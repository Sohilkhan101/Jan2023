package Lecture31;

public class Search {
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

	public boolean search(TreeNode root, int val) {
		// TODO Auto-generated method stub

		if (root == null) {
			return false;
		}

		if (val == root.val) {
			return true;
		}

		boolean left = false;
		boolean right = false;
		if (root.val > val) {
			left = search(root.left, val);
		} else {
			right = search(root.right, val);
		}

		return left || right;
	}
}
