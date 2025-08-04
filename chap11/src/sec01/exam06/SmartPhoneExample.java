package sec01.exam06;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("구글","안드로이드");
		
		String strobj = smartPhone.toString();
		System.out.println(strobj);
		
		
		System.out.println(smartPhone);
	}
}
