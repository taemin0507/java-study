package sec02.exam07;

import java.util.Scanner;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);		
		boolean result2 = (num1 != num2);		
		boolean result3 = (num1 <= num2);		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		//문자의 대소비교
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2; // 65 < 66
		System.out.println("result4=" + result4);
		
		// Quiz
//		두개의 숫자를 입력받아
//		앞의 수가 크거나 같은 경우 true를
//		뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		 1 2 => false
//		10 5 => true
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean result5 = a >= b;
		System.out.println("결과 : " + result5);
		
	}

}
