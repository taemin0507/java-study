package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double dou;
		double dou2;
		double dou3;
		
		System.out.print("국어 : ");
		dou = sc.nextDouble();
		System.out.print("영어 : ");
		dou2 = sc.nextDouble();
		System.out.print("수학 : ");
		dou3 = sc.nextDouble();
		System.out.println("총점 : " +(int)(dou + dou2 + dou3));
		System.out.println("평균 : " + (int)(dou + dou2 + dou3)/3);
	}

}
