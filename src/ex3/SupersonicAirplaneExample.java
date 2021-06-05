package ex3;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane airplane = new SupersonicAirplane();
		
		airplane.takeOff();
		airplane.fly();
		
		airplane.flymode = SupersonicAirplane.SUPERSONIC;
		airplane.fly();
		
		airplane.flymode = SupersonicAirplane.NORMAL;
		airplane.fly();
		
		airplane.land();
	}
}
