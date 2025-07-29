package homework;

import java.util.Arrays;

public class HomeWork04 {

	public static void main(String[] args) {
		int[] x = new int[6];

		for (int i = 0; i < x.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			boolean y = false;

			for (int j = 0; j < i; j++) {
				if (x[j] == num) {
					y = true;
					break;
				}
			}

			if (!y) {
				x[i] = num;
			}
		}
		Arrays.sort(x);

		for (int n : x) {
			System.out.print(n + " ");
		}
	}

}
