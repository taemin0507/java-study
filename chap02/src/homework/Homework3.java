package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();
		System.out.printf("첫번째 문자 : %s",str.charAt(0));
		System.out.printf("\n두번째 문자 : %s",str.charAt(1));
		System.out.printf("\n세번째 문자 : %s",str.charAt(2));
	}

}
/*
 * package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자: " + str.charAt(0));
		System.out.println("두번째 문자: " + str.charAt(1));
		System.out.println("세번째 문자: " + str.charAt(2));			
	}

}
*/
