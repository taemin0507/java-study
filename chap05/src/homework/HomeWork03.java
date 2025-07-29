package homework;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;

		while (true) {
			System.out.print("정수 : ");
			x = sc.nextInt();

			if (x < 3 || x % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				int[] y = new int[x];
				int mid = x / 2;

				for (int i = 0; i <= mid; i++) {
					y[i] = i + 1;
				}

				for (int i = mid + 1; i < x; i++) {
					y[i] = x - i;
				}

				for (int i = 0; i < x; i++) {
					if(i>0) {
					System.out.print(", ");
					}	
					System.out.print(y[i]);
				}
				System.out.println();
				break;
			}
		}

	}
}
