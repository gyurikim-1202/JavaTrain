package t20230428_2;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCal = new Calculator();
		
		//리턴값이 없는 powerOn() 메소드 호출
		myCal.powerOn();
		
		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴받아 result1 변수에 대입
		int result = myCal.plus(5, 6);

	}

}
