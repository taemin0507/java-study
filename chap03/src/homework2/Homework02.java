package homework2;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int a = sc.nextInt();
		
		String str = (a % 2 == 1)? "홀수":"짝수";
		System.out.printf("구슬의 개수는 %s입니다.",str);
	}

}
