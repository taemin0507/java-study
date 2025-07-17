package homework2;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String str = sc.nextLine();
		String str1 = ((char)str.charAt(7) == '1')||((char)str.charAt(7) == '3')? "남자" :((char)str.charAt(7) == '2')||((char)str.charAt(7) == '4')? "여자": "잘못된 값" ;
		System.out.println("입력하신 주민번호는 "+str1 + "입니다.");
	
		
		
	}

}
