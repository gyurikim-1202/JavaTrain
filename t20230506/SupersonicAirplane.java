package t20230506;

public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태 필드 선언
	public int flyMode = NORMAL;

	
	@Override
	//일반 비행 모드 -> Airplane의 fly() 사용
	//초음속 비행 모드 -> 오버라이딩된 SupersonicAirplane의 fly() 사용
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}
