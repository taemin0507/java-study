package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++; // x = x + 1; => 11 
		++x; // x = x + 1; => 12
		System.out.println("x=" + x);
		
		System.out.println("------------------------");
		y--; // y = y - 1; => 9
		--y; // y = y - 1; => 8
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		System.out.println("------------------------");
		// 후위 연산자는 값을 먼저 사용한 뒤 증감시키는 연산자
		z = x++; // z = x; x = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		// 전위 연산자는 값을 먼저 증감 시킨 뒤 사용하는 연산자
		System.out.println("------------------------");
		z = ++x; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------------");
		z = ++x + y++; //  1번 x = x + 1; | 2번 z = x + y; | 3번 y = y + 1;  
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("------------------------");
		// Quiz
				// 다음 코드 실행 후 x의 값은? x = 5 
				// 첫번째 3이 참이니깐 1증가 4
				// 두번째 4에서 1증가해서 5
				x = 3;

				if (x++ == 3) {
				    x++;
				    System.out.println("x=" + x);
				}
				
				System.out.println("-----------------------");
				// 다음 코드 실행 후 x, y의 값은? x = 3, y = 7
				// 첫번째 1 , 2번째 증가증가해서 3, 3번째 x = 3, 네번째 y = 1 + 3 + 3 = 7
				x = 1;
				y = x++ + ++x + x; 
				System.out.println("x=" + x);
				System.out.println("y=" + y);
	
		
	}

}
