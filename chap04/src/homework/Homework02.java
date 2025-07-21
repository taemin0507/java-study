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
			 if (y >= 35) {
				 c = "폭염 경보";
			} else if (y >= 33) {
				 c = "폭염 주의보";
			}else {
				c = "";
			}
		} else if (x>=9 && x<=11) {
			 z = "가을";
		} else if (x == 12 || ((x <= 2) && (x > 0))) {
			 z = "겨울";
			 if (y <= -15) {
				 c = "한파 주의보";
			}else if (y <= -12) {
				 c = "한파 경보";			
			} else {
				 c = "";						
			}
		}else {
			System.out.println("해당하는 계절은 없습니다.");
		}
		
		System.out.printf("%s %s",z,c);
		
		//Early Return Pattern
		//에러나 예외 조건을 먼저 검사 하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
		//장점: 1) 커드 가독성이 종아침 2) 코드의 중첩을 줄일 수 있음
		
		
		
		
//	Scanner sc = new Scanner(System.in);
//		
//		System.out.print("월: ");
//        int month = sc.nextInt();
//
//        System.out.print("기온: ");
//        int temperature = sc.nextInt();
//
//        String season = "";
//        
//        // Early Return Pattern
//        // 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
//        // 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
//        if (month < 1 || month > 12) {
//        	System.out.println("해당하는 계절이 없습니다.");
//        	return;
//        }
//        
//        if (month >= 3 && month <= 5) {
//        	season = "봄";
//        } else if (month >= 6 && month <= 8) {
//        	season = "여름";
//        	
//        	if (temperature >= 35) {
//        		season += " 폭염 경보";
//        	} else if (temperature >= 33) {
//        		season += " 폭염 주의보";        		
//        	}
//        } else if (month >= 9 && month <= 11) {
//            season = "가을";
//        } else {
//            season = "겨울";
//            
//            if (temperature <= -15) {
//            	season += " 한파 경보";
//            } else if (temperature <= -12) {
//            	season += " 한파 주의보";
//            }
        }
        
        System.out.println(season);
		
		
		
		
	}

}
