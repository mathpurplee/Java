package ex6_interface;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {   // "�Ķ���� vehicle(�������̽� VehicleŸ��)�� ���� BusŸ���̾��ٸ�"
			Bus bus = (Bus)vehicle;    // �Ķ���� vehicle�� Ÿ�� Vehicle�� BusŸ������ ����Ÿ������ȯ
			bus.checkFare();
		}
		vehicle.run();
	}
}
