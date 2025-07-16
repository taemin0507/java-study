package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double m;
		double m2;
		
		System.out.print("가로 : ");
		m = sc.nextDouble();
		System.out.print("세로 : ");
		m2 = sc.nextDouble();
		System.out.printf("면적 : %.2f",m*m2);
		System.out.printf("\n둘레 : %.1f",(m+m2)*2);
	}

}
