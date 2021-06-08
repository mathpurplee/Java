package ex6_interface;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 인터페이스 변수 = 구현객체;
		vehicle.run();
		//vehicle.chechFare(); (X)
		
		Bus bus = (Bus)vehicle; // 강제타입 변환 : 구현클래스 변수 = (구현클래스)인터페이스 변수; 
		                        // 인터페이스 변수를 구현클래스로 강제 타입 변환
		bus.run();
		bus.checkFare();
	}

}
