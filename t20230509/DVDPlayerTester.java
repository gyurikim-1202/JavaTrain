package t20230509;
//DVD 플레이어 클래스 사용 예
public class DVDPlayerTester {
	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Players b = new DVDPlayer();
		ExPlayer c = new DVDPlayer();
		
		System.out.println("DVDPlayer형 변수a");
		a.play();  //재생
		a.stop();  //정지
		a.slow();  //느린 재생
		
		System.out.println("Player형 변수b");
		b.play();
		b.stop();
		
		System.out.println("ExPlayer형 변수c");
		c.play();
		c.stop();
		c.slow();
	}

}
