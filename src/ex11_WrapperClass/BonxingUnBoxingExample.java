package ex11_WrapperClass;

public class BonxingUnBoxingExample {
	public static void main(String[] args) {
		//�ڽ�
		Integer obj1 = new Integer(100); // �⺻ Ÿ���� ���� �� ���
		Integer obj2 = new Integer("200"); // ���ڿ��� �� ���
		Integer obj3 = Integer.valueOf("300"); // ������ �̿����� �ʰ� ���� �޼ҵ� valueOf() Ȱ��
		
		//��ڽ�
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//�ڵ� �ڽ�
		Integer obj = 100;
		System.out.println("obj = " + obj);
		
		//���� �� �ڵ� ��ڽ�
		int value = obj;
		System.out.println("value = " + value);
		
		//���� �� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("result = " + result);
		
		//���ڿ��� �⺻Ÿ�� ������ ��ȯ
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		System.out.println("b = " + b);
		
		// math.random()�޼ҵ����
		// Ÿ�Ը� x = (Ÿ�Ը�)(Math.random() * n) + s
		// s=< x <n  ������ ���ǰ�
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("1~10 ������ ������ : " + num);
	}
}
