package ex2;

public class Car {
	/* �ν��Ͻ� */
	// �ʵ�
	String model;
	int speed;
	
	// ������
	Car(String model) { // public Car(String model), public ���� ����
		this.model = model; // �ʵ� model = �Ķ���� model
	}
	
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed; // �ʵ� speed = �Ķ���� speed
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");
		}
	}
	
	/* ���� */
	// �ʵ�
	static double pi = 3.14159;
	
	// �޼ҵ�
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
