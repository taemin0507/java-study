package sec03.exam05;

public class OperationPromationExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue + byteValue2; // int + int
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// char도 마찬가지(연산 시 int로 형변환)
		char charValue1 = 'A'; // 문자가 아니라 유니코드 65가 저장됨
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; // int + int
		int intValue2 = charValue1 + charValue2; // 65 + 1 
		System.out.println("유니코드= " + intValue2);
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환
		System.out.println("출력문자= " + (char) intValue2);
		
		// 정수 / 정수 = 정수
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수 연산의 결과는 정수, 10 / 4 = 2
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);
		
		// 실수 결과를 얻으려면
		double doubleValue2 = intValue3 / 4.0; // 10.0 / 4.0 = 2.5
		System.out.println(doubleValue2);
		
		int x = 1;
		int y = 2;
//		double result = (double) x / y ; // 1.0 / 2.0 = 0.5 
//		double result =  x / (double) y ;
		double result = (double) x / (double) y ;
		System.out.println(result);
		
		// Quiz
//		아래의 변수들을 선언, 초기화하세요.
//		두 수를 더한 값을 출력하는 프로그램을 구성하세요.
//		1. 정수형 변수 num1에 10 할당
//		2. 실수형 변수 num2에 5.7 할당
//		
//		[출력]
//		정수 결과: 15		
//		실수 결과: 15.7
		
		int num1 = 10;
		double num2 = 5.7;
		
		int result1 = num1 + (int) num2;
		double result2 = num1 + num2;
		
		System.out.println("정수 결과: " + result1);
		System.out.println("실수 결과: " + result2);
		
		
		
		
	}

}
