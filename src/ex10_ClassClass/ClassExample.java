package ex10_ClassClass;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		// Class ��ü ���� ���
		// ù ��° ���
		Class clazz = EX.class;
		
		// �� ��° ���
		// Class clazz = Class.forName("ex10_ClassClass.EX");
		
		// �� ��° ���
		// EX ex = new EX();
		// Class clazz = ex.getClass();
		
		System.out.println(clazz.getName()); // ��Ű���� + Ŭ������
		System.out.println(clazz.getSimpleName()); // Ŭ������
		System.out.println(clazz.getPackage().getName()); // ��Ű����
	}

}
