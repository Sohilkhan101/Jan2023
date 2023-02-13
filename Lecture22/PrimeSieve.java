package Lecture22;

public class PrimeSieve {
	public static void main(String[] args) {
		int n = 47;
		boolean[] board = new boolean[n + 1];

		for (int i = 2; i * i <= n; i++) {
			for (int mul = 2; mul * i <= n; mul++) {
				board[mul * i] = true;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (!board[i]) {
				System.out.println(i);
			}
		}

	}

}
