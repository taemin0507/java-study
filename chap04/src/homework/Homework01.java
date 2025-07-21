package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 놀이동상 입장료 계산하기 ===");
		System.out.print("나이 : ");
		int x = sc.nextInt();
	
// 조건 순서에 주의!		
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
//Scanner sc = new Scanner(System.in);
//
//System.out.print("나이: ");
//int age = sc.nextInt();
//
//int fee;
//
//// 조건 순서에 주의!
//if (age < 3) { // 3세 미만
//	fee = 0;
//} else if (age <= 12) { // 3세 ~ 12세
//	fee = 10000;
//} else if (age <= 18) { // 13세 ~ 18세
//	fee = 20000;
//} else if (age <= 64) { // 19세 ~ 64세
//	fee = 30000;
//} else { // 65세 이상
//	fee = 0;
//}
//
//System.out.println("요금은 " + fee + "원입니다.");
//}