package Lecture32;

import java.util.*;

public class Create_Tree_Using_Level_Order {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Create_Tree_Using_Level_Order() {
		this.root = CreateTree();
	}

	private Node CreateTree() {
		Queue<Node> qq = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		qq.add(nn);
		while (!qq.isEmpty()) {
			Node rv = qq.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				qq.add(n);
			}
			if (c2 != -1) {
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				qq.add(n);
			}

		}

		sc.close();
		return root;
	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PostOrder(node.left);
		PostOrder(node.right);

	}

	public static void main(String[] args) {
		Create_Tree_Using_Level_Order clv = new Create_Tree_Using_Level_Order();
		clv.PostOrder();

	}

}


//10 20 50 30 40 60 70 -1 -1 -1 -1 -1 -1 -1 -1

//10 20 70 -1 40 80 -1 50 60 -1 -1 -1 -1 -1 -1




