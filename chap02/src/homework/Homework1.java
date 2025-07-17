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
		System.out.printf("BMI 지수 : %.1f\n",kg/(m*m));
	
	}

}

/*package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m): ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		System.out.printf("BMI 지수: %.1f\n", bmi);
		System.out.println("BMI 지수: " + (int) (bmi * 10) / 10.0);
		System.out.println("BMI 지수: " + Math.floor(bmi * 10) / 10.0);
	}

}
*/
