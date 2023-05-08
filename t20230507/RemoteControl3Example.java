package t20230507;

public class RemoteControl3Example {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl2 rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television2();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio2();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
