package ex8_exception;

public class TrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");  // java.lang.String2의 클래스는 없다고 가정
	}
}
