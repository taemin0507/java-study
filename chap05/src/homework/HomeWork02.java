package homework;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("정수 : ");
		x = sc.nextInt();

		int[] i = new int[x];

		for (int j = 0; j < i.length; j++) {
			System.out.print("배열" + j + "번째 인덱스에 넣을 값 : ");
			i[j] = sc.nextInt();
		}

		int sum = 0;

		for (int z : i) {
			sum += z;
		}

		System.out.println("총합 : " + sum);

	}

}
