package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		str = sc.nextLine();
		char ch = str.charAt(0);
		int num = ch - '0'; 
		System.out.printf("입력한 숫자의 제곱은 %d 입니다.", num*num);
	}

}
