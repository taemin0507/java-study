package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 75;
		
		// 값이 오는 자리에 연산식이 올 수도 있음
		char grade = (score > 90)? 'A' : ((score > 80)? 'B': 'C') ;
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
//		if((x>= 0) && (x<=100)) {
//			if(x >= 60) {
//				System.out.println("합격");
//			}
//			else {
//				System.out.println("불합격");
//			}
//		}
//		else {
//			System.out.println("점수입력오류");
//		}
//		
		String y = (x>100)||(x < 0)? "점수입력오류" :((x >= 60)? "합격": "불합격");
		 System.out.println(y);
		 
		
		
		
		
		
		
	}

}
