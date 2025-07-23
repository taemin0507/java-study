package homework02;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int sum = 0;
		
		while(true) {
			
			System.out.print("숫자(0을 입력하면 종료): ");
			x = sc.nextInt();
			
			if (x == 0) {
				break;
			}else if (x<0) {
				continue;
			}
			
			sum += x;
		}
			
		System.out.println("양수의 합: " + sum);
			
			
			
			
	}
}
