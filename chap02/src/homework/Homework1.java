package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double kg;
		double m;
		
		System.out.print("몸무게(kg) : ");
		kg = sc.nextDouble();
		System.out.print("키(m) : ");
		m = sc.nextDouble();
		System.out.printf("BMI 지수 : %.1f",kg/(m*m));
		
	}

}
