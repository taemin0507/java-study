package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "부장";
		
		// java 7 부터 정수 타입 외에 문자열도 허용
		
		switch (position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
				break;
		}
		
		System.out.println("_________________________________________________________________");
		//Quiz
		// 위 switch 문을 if문으로 변경
		
		if (position.equals("부장")) {
			System.out.println("700만원");
		}else if (position.equals("과장")) {
			System.out.println("500만원");
		}else {
			System.out.println("300만원");
		}
		
		
	}

}
