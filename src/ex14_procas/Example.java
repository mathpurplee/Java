package ex14_procas;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		//promotion
		Child child = new Child(); 
		Parent p = child; // 자동 타입 변환, child가 참조하는 객체(Child)의 주소값을 p에 복사
		//== Parent p = new Child();
		
		 
		System.out.println(p.getClass().getName()); // ex14_procas.Child
		System.out.println(child.getClass().getName()); // ex14_procas.Child
		
		p.method1(); // 부모클래스의 메소드에만 접근 가능.
		p.method2(); // 예외로 오버라이딩 된 자식 클래스의 메소드가 호출됨.
		
		//casting
		//Parent p = child;
		Child c = (Child) p; // 강제 타입 변환, Parent타입인 p를 Child타입으로.
		System.out.println(c.getClass().getName()); // ex14_procas.Child

	}
}
