package Lecture21;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String word = "ABCCED";
		int idx = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
					boolean ans = search(grid, i, j, idx, word);
					if (ans) {
						System.out.println("True");
						return;
					
				}
			}
		}
		System.out.println("False");
	}

	private static boolean search(char[][] grid, int row, int col, int idx, String word) {
		// TODO Auto-generated method stub
		if (idx == word.length()) {
			return true;
		}

		if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != word.charAt(idx)) {
			return false;
		}

		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		char ch = grid[row][col];
		grid[row][col] = '*';
		boolean ans = false;
		for (int i = 0; i < c.length; i++) {
			ans = search(grid, row + r[i], col + c[i], idx + 1, word);
			if (ans)
				return true;
		}
		grid[row][col] = ch;
		
		return ans;
	}

}
