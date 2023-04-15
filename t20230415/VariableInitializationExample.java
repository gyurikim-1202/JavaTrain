package t20230415;
// 초기화되지 않은 변수를 연산식에 사용하여 에러가 나는 경우
// 변수값 설정하여 에러 해결
public class VariableInitializationExample {

	public static void main(String[] args) {
		// 변수 value 선언
		int value = 1;
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//변수 reslut 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
