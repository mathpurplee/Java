package ex14_procas;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		//promotion
		Child child = new Child(); 
		Parent p = child; // �ڵ� Ÿ�� ��ȯ, child�� �����ϴ� ��ü(Child)�� �ּҰ��� p�� ����
		//== Parent p = new Child();
		
		 
		System.out.println(p.getClass().getName()); // ex14_procas.Child
		System.out.println(child.getClass().getName()); // ex14_procas.Child
		
		p.method1(); // �θ�Ŭ������ �޼ҵ忡�� ���� ����.
		p.method2(); // ���ܷ� �������̵� �� �ڽ� Ŭ������ �޼ҵ尡 ȣ���.
		
		//casting
		//Parent p = child;
		Child c = (Child) p; // ���� Ÿ�� ��ȯ, ParentŸ���� p�� ChildŸ������.
		System.out.println(c.getClass().getName()); // ex14_procas.Child

	}
}
