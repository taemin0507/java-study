package sec02.exam03;

import java.util.Scanner;

public class ForPrintFrom1To10Example2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합
				int sum = 0;
				int i;
				for (i = 1; i <= 100 ; i++) {
//					sum = sum + i;
					sum += i;
				}
				System.out.println("1~" + (i-1)+ "합:" + sum);
				//(참고) 무한 루프
				int count = 0;
				for(;;) {
					System.out.println("무한 반복");
					
					count ++;
					
					//실제 사용 예: 특정 조건을 만족하면 멈추도록
					if (count == 6) {
						break;
					}
				}
				
				// Quiz1: 1부터 100까지 짝수의 합
				
				
				
				
				// Quiz2: 
//				숫자를 입력받아 입력받은 수가 
//				짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//				홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//				을 구하는 프로그램을 구현하시오
		//
//				[입력]  [출력]
//				 10  => 30
//				 11  => 36
				
				int sum2 = 0; 
				for (int i3 = 0; i3 <= 100; i3 += 2) {
					sum2 += i3;
				}
				System.out.println(sum2);
				
				Scanner sc = new Scanner(System.in);
				
				int x =sc.nextInt();
				int sum3 = 0;
				if(x % 2 == 0) {
					for (int i2 = 2;i2 <= x; i2 += 2) {
						sum3 += i2; 	
					}
				} else {
					for (int i2 = 1;i2 <= x; i2 += 2) {
						sum3 += i2;
					}
				}
				
					System.out.println(sum3);
							
	}
}
