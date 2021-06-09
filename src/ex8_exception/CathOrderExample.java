package ex8_exception;

public class CathOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {         // ���� catch ��� - ���� ���� Ŭ������ ���� ����Ŭ�������� �Ʒ� ��ġ
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch(Exception e) {
			System.out.println("RUNTIME ERROR");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
	
}
