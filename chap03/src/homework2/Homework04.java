package homework2;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int x = sc.nextInt();
		System.out.print("수학 : ");
		int y = sc.nextInt();
		System.out.print("영어 : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		int avg = (x + y + z)/3;
		
		System.out.printf("합계 : %d점\n",sum);
		System.out.printf("평균 : %d점\n",avg);
		
		String str = (avg >=90) && ((x >=60) && (z >= 60) && (y >= 60))? "핸드폰 바꾸기": "핸드폰을 바꿀수 없습니다.";
		System.out.println(str);
		
	}

}
