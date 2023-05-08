package t20230507;

public class RemoteControlExample {

	public static void main(String[] args) {
		// RemoteControl rc = new Television(); 도 가능
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 ㅐ입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입
		rc = new Audio();
		rc.turnOn();
	}
}
