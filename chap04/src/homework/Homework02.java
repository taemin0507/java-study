package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String z = "";
		String c = "";
		System.out.print("월 : ");
		int x = sc.nextInt();
		System.out.print("기온 : ");
		int y= sc.nextInt();
		
		if (x>=3 && x<=5) {
			 z = "봄";
		} else if (x>=6 && x<=8) {
			 z = "여름";
		} else if (x>=9 && x<=11) {
			 z = "가을";
		} else if (x == 12 || ((x <= 2) && (x > 0))) {
			 z = "겨울";
		}else {
			System.out.println("해당하는 계절은 없습니다.");
		}
		
		if (y >= 35) {
			 c = "폭염 경보";
		} else if (y >= 33) {
			 c = "폭염 주의보";
		} else if (y <= -15) {
			 c = "한파 주의보";
		}else if (y <= -12) {
			 c = "한파 경보";			
		} else {
			 c = "";						
		}
		
		System.out.printf("%s %s",z,c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
