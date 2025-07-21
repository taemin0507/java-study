package homework2;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		
		// 삼향(조건) 연산자 이용
		// 변수 쪽에 equals()를 호출하면, input이 null일 경우 예외(NPE)가 발생할 수 있음
		
		String y = (input.equals("간다"))? "온다" : "간다" ;
		// 리터널이나 상수를 앞에 두면, input이 null이어도 안전하게 비교 가능(null-safe)
//		String output = "간다".equals("간다") ? "온다":"간다";
		//String output = "간다".equals(input) ? "온다":"간다";
		
		
		System.out.printf("앵무새 : %s\n",y);
	}

}
