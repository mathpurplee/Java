package ex5_interface;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� - �������̽��� �޼ҵ�� �߻�޼ҵ�(���� ��)�� ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
