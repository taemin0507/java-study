package homework02;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		while(true) {
			System.out.print("정수 : ");
			x = sc.nextInt();
			
			
			if (x <= 0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for (int i = 0; i < x; i++) {
					if(i%2==0) {
						System.err.print("박");
					}else {
						System.err.print("수");
					}
			
				}
				break;
			}
			
			
			
		}
	}

}
