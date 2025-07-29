package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.fiyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.fiyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
