package t20230507;

public class Television implements RemoteControl {
	@Override  //인터페이스에 생성된 turnOn() 추상 메소드 재정의
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
