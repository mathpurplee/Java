package ex2;

public class CarExample {
	public static void main(String args[]) {
		Car myCar = new Car("Æ÷¸£½¦");
		Car yourCar = new Car("º¥Ã÷");
		
		myCar.run();
		yourCar.run();
		
		double result1 = Car.pi;
		int result2 = Car.plus(10, 5);
		int result3 = Car.minus(10, 5);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
