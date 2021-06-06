package ex4_InstanceOf;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {  // A instanceof B : A�� '����' BŸ���̾����� Ȯ��
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
	}
	
    public static void method2(Parent parent) {
    	Child child = (Child) parent; 
    	System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // ClassCastException error �߻�
	}
}
