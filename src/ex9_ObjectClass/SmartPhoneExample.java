package ex9_ObjectClass;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "ios");
		
		String strObj = myPhone.toString(); // �����ǵ� toString() ȣ��
		System.out.println(strObj);
		
		System.out.println(myPhone); // �����ǵ� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
	}
}
