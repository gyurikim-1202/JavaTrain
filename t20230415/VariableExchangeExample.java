package t20230415;
// 두 변수의 값을 temp 변수로 교환하는 방법
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y );
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
			
			

	}

}
