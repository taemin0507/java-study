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
/*package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double width = sc.nextDouble();

		System.out.print("세로: ");
		double height = sc.nextDouble();
		
		System.out.println("면적: " + width * height);
		System.out.println("둘레: " + (width + height) * 2);		
	}

}*/