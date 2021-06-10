package ex10_ClassClass;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		// Class 객체 정보 얻기
		// 첫 번째 방법
		Class clazz = EX.class;
		
		// 두 번째 방법
		// Class clazz = Class.forName("ex10_ClassClass.EX");
		
		// 세 번째 방법
		// EX ex = new EX();
		// Class clazz = ex.getClass();
		
		System.out.println(clazz.getName()); // 패키지명 + 클래스명
		System.out.println(clazz.getSimpleName()); // 클래스명
		System.out.println(clazz.getPackage().getName()); // 패키지명
	}

}
