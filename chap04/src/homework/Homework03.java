package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int y = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int z = sc.nextInt();
		
		if (x > y) {
			if (y > z) {
				System.out.println(z);
			}else {
				System.out.println(y);		
			}
		}else if (y > z){
			if (x > z) {
				System.out.println(z);
			}else {
				System.out.println(x);
			}
		}else {
			if (z > x) {
				System.out.println(x);
			}else {
				System.out.println(y);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
