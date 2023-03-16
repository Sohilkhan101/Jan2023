package Lecture36;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "74";
		int n = s.length();
		
		int k = (1 << n) - 2;

		int count = 0;
		int pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				count += (1 << pos);
			}
			pos++;
		}
		count = count + k + 1;
		System.out.println(count);

	}

}
