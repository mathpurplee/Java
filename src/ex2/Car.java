package ex2;

public class Car {
	/* 인스턴스 */
	// 필드
	String model;
	int speed;
	
	// 생성자
	Car(String model) { // public Car(String model), public 생략 가능
		this.model = model; // 필드 model = 파라미터 model
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed; // 필드 speed = 파라미터 speed
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
	
	/* 정적 */
	// 필드
	static double pi = 3.14159;
	
	// 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
