package Lecture40;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {

	public class Node {
		char ch;
		HashMap<Character, Node> children = new HashMap<>();
		boolean istreminal;
		int count;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			istreminal = false;

		}
	}

	private Node root;

	public Contacts() {
		// TODO Auto-generated constructor stub
		this.root = new Node('*');
	}

	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (curr.children.containsKey(ch)) {
				curr = curr.children.get(ch);
			} else {
				Node node = new Node(ch);
				curr.children.put(ch, node);
				curr = node;
			}
			curr.count++;

		}
		curr.istreminal = true;

	}

	public int find(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (!curr.children.containsKey(ch)) {

				return 0;
			}
			curr = curr.children.get(ch);

		}
		return curr.count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Contacts t = new Contacts();
		while (n-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();

			if (s1.equals("add")) {
				t.insert(s2);
			} else {
				System.out.println(t.find(s2));
			}

		}
		sc.close();
	}

}