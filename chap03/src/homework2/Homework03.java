package homework2;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수 : ");
		int x = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int y = sc.nextInt();
		// 1인당 사탕의 수
		int z = y/x;
		System.out.printf("1인당 사탕 개수 : %d개\n", z);
		// 남은 사탕의 수
		int v = y%x;
		System.out.printf("남은 사탕 개수 : %d개\n", v);
		
		
	}

}
