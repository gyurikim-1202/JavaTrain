package t20230509;
//스킨 변경이 가능하고 탈착이 가능한 헤드마운트 디스플레이 클래스
public class HeadMountedDisplay implements Wearable, Skinnable {
	private int skin;  //스킨
	
	//착용
	public void putOn() {
		System.out.println("디스플레이를 착용했습니다.");
	}
	
	//해제
	public void putOff() {
		System.out.println("디스플레이를 벗었습니다.");
	}
	
	//스킨 변경
	public void changeSkin(int skin) {
		this.skin = skin;
	}
	
	//현재 스킨 표시
	public void putSkin() {
		switch (skin) {
		case BLACK: System.out.print("BLACK DISPLAY"); break;
		case RED: System.out.print("RED DISPLAY"); break;
		case GREEN: System.out.print("GREEN DISPLAY"); break;
		case BLUE: System.out.print("BLUE DISPLAY"); break;
		case YELLOW: System.out.print("YELLOW DISPLAY"); break;
		}
	}
}
