package homework2;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String str = sc.nextLine();
		String y = (str.equals("간다"))? "온다" : "간다" ;
		System.out.printf("앵무새 : %s\n",y);
	}

}
