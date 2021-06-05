package ex1;

public class Computer extends Calculator { // Calculator을 부모로 상속
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areCircle실행");
		return Math.PI * r * r;
	}
}
