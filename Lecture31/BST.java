package Lecture31;

public class BST {
	public class Node {
		int data;
		Node left;
		Node right;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public BST(int[] arr) {
		root = CreateBST(arr, 0, arr.length - 1);
	}

	private Node CreateBST(int[] arr, int si, int ei) {

		if (si > ei) {
			return null;
		}

		int mid = (si + (ei + 1)) / 2;
		Node nn = new Node(arr[mid]);

		nn.left = CreateBST(arr, si, mid - 1);
		nn.right = CreateBST(arr, mid + 1, ei);

		return nn;
	}

	public void preOurder() {
		preOurder(this.root);
	}

	private void preOurder(Node root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOurder(root.left);
		preOurder(root.right);
	}

	public boolean search(int val) {
		return search(this.root, val);
	}

	private boolean search(Node root, int val) {
		// TODO Auto-generated method stub

		if (root == null) {
			return false;
		}

		if (val == root.data) {
			return true;
		}

		boolean left=false;
		boolean right=false;
		if (root.data > val) {
			left = search(root.left, val);
		} else {
			right = search(root.right, val);
		}

		return left || right;
	}
	public void insert(int val) {
		 insert(this.root, val);
	}

	private void insert(Node root, int val) {

		
		if (root.data > val) {
			 search(root.left, val);
		} else {
			search(root.right, val);
		}
		
	}
}
