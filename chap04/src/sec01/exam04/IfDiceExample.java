package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
//		int num = 5;
		int num = (int) (Math.random() * 6) + 1; // 주사위 던지기를 구현
		
//		System.out.println(Math.random()); // 0.0 이상 1.0 미만의 실수값을 변환
		// 0.0 <= Math.random() < 1.0 사이의 double형 실수값
		// 0.0 <= Math.random() * 6 < 6.0 사이의 double형 실수값
		// 0 <= (int) (Math.random() * 6) < 6 사이의 int형 정수값
		// 1 <= (int) (Math.random() * 6) + 1 < 7 사이의 int형 정수값
		
		// 공식화 : (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		
		
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {			
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {			
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {			
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {			
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");			
		}
	}

}
