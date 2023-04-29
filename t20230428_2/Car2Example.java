package t20230428_2;

public class Car2Example {

	public static void main(String[] args) {
		//Car2 객체 생성
		Car2 myCar2 = new Car2();   //myCar2 객체 생성
		
		//리턴값이 없는 setGas() 메소드 호출
		myCar2.setGas(5);
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar2.isLeftGas()) {   //myCar2 필드를 읽고 isLeftGas 메소드 호출
			System.out.println("출발합니다.");
			
			//리턴값이 없는 run() 메소드 호출
			myCar2.run();
		}
		
		System.out.println("gas를 주입해주세요.");

	}

}
