package ex7_interface;

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImeplementationC - methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImeplementationC - methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImeplementationC - methodC() 실행");
	}
}
