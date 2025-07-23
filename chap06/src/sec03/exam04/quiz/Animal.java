package sec03.exam04.quiz;

public class Animal {

	String kind;
	int age;

	// 종류와 나이를 모두 받는 생성자(최종 목적지 한 군데에서만 초기화 실행)
	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	public Animal(String kind) {
		this(kind, 1);
	}

	public Animal(int age) {
		this("사람", age);
	}

	// 출력 메소드
	
	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
