package ex11_WrapperClass;

public class BonxingUnBoxingExample {
	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(100); // 기본 타입의 값을 줄 경우
		Integer obj2 = new Integer("200"); // 문자열을 줄 경우
		Integer obj3 = Integer.valueOf("300"); // 생성자 이용하지 않고 정적 메소드 valueOf() 활용
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//자동 박싱
		Integer obj = 100;
		System.out.println("obj = " + obj);
		
		//대입 시 자동 언박싱
		int value = obj;
		System.out.println("value = " + value);
		
		//연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result = " + result);
		
		//문자열을 기본타입 값으로 변환
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		System.out.println("b = " + b);
		
		// math.random()메소드공식
		// 타입명 x = (타입명)(Math.random() * n) + s
		// s=< x <n  범위의 임의값
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("1~10 사이의 랜덤값 : " + num);
	}
}
