package ex6_interface;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {   // "파라미터 vehicle(인터페이스 Vehicle타입)이 원래 Bus타입이었다면"
			Bus bus = (Bus)vehicle;    // 파라미터 vehicle의 타입 Vehicle을 Bus타입으로 강제타입형변환
			bus.checkFare();
		}
		vehicle.run();
	}
}
