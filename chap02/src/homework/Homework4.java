package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자를 입력하세요 : ");
		str = sc.nextLine();
//		char ch = str.charAt(0);
//		System.out.printf("A의 유니코드: %d\n", (int)ch );
		System.out.printf("A의 유니코드: %d\n", (int)str.charAt(0));
	}

}
/*package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		char inputChar = sc.nextLine().charAt(0);
		
		int unicode = inputChar;
		System.out.println(inputChar + "의 유니코드: " + unicode);
	}

}*/