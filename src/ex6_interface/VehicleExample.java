package ex6_interface;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // �������̽� ���� = ������ü;
		vehicle.run();
		//vehicle.chechFare(); (X)
		
		Bus bus = (Bus)vehicle; // ����Ÿ�� ��ȯ : ����Ŭ���� ���� = (����Ŭ����)�������̽� ����; 
		                        // �������̽� ������ ����Ŭ������ ���� Ÿ�� ��ȯ
		bus.run();
		bus.checkFare();
	}

}
