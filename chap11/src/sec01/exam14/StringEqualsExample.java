package sec01.exam14;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = new String("이태민");
		String strVal2 = "이태민";
		String strVal3 = "이태민";
		
		if(strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if(strVal2 == strVal3) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		
		
		
	}
}
