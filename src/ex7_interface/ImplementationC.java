package ex7_interface;

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImeplementationC - methodA() ����");
	}

	@Override
	public void methodB() {
		System.out.println("ImeplementationC - methodB() ����");
	}

	@Override
	public void methodC() {
		System.out.println("ImeplementationC - methodC() ����");
	}
}
