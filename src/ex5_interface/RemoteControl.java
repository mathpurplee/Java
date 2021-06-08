package ex5_interface;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 - 인터페이스의 메소드는 추상메소드(선언만 함)로 간주
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
