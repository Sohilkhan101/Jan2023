package Lecture26;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}(";
		System.out.println(check(s));
	}
	private static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		System.out.println(st.isEmpty());
		for (int i = 0; i < s.length(); i++) {
			if (!st.isEmpty() && s.charAt(i) == ')') {
				char ch = st.pop();
				if (ch != '(') {
					return false;
				}
			} else if (!st.isEmpty() && s.charAt(i) == ']') {
				char ch = st.pop();
				if (ch != '[') {
					return false;
				}
			} else if (!st.isEmpty() && s.charAt(i) == '}') {
				char ch = st.pop();
				if (ch != '{') {
					return false;
				}
			} else {
				st.push(s.charAt(i));
			}

		}
		System.out.println(st);
		if(st.isEmpty())
		return true;

		return false;
	}

}
