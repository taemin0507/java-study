package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 놀이동상 입장료 계산하기 ===");
		System.out.print("나이 : ");
		int x = sc.nextInt();
	
		
		if (x >= 65) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		} else if((x>=19)&&(x<65)) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		} else if((x>=13)&&(x<19)) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		} else if((x>=3)&&(x<13)) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		} else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
			
		}
	}

}
