package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10; // result = result + 10;
		System.out.println("result=" + result);

		result -= 5; // result = result - 5;
		System.out.println("result=" + result);
		
		result *= 3; // result = result * 3;
		System.out.println("result=" + result);
		
		result /= 5; // result = result / 5;
		System.out.println("result=" + result);
		
		result %= 3; // result = result % 3;
		System.out.println("result=" + result);

		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개
		
		 Scanner sc = new Scanner(System.in);
		
		 int x = sc.nextInt();
		
		 int x500 = x /500;
		 x =  x % 500;
		 System.out.printf("500원 %d개\n", x500);
		 int x100 = x /100;
		 x =  x % 100;
		 System.out.printf("100원 %d개\n", x100);
		 int x50 = x /50;
		 x =  x % 50;
		 System.out.printf("50원 %d개\n", x50);
		 int x10 = x /10;
		 x =  x % 10;
		 System.out.printf("10원 %d개\n", x10);
		 int x1 = x /1;
		 x =  x % 1;
		 System.out.printf("1원 %d개\n", x1);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
