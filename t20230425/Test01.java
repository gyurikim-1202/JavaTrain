package t20230425;

import java.util.Scanner;

//1부터 n까지의 정수의 합을 구해서 반환하는 메소드 작성: int sumUp(int n)
class Test01 {
//--- 1부터 n까지의 합---//
	//Static: static 영역에 변수 선언,int sumUp(): ()값을 정수로 출력, sumUp(int n): n값은 정수만 가능
	static int sumUp(int n) {		
	int sum = 0;	//sum 초기화
		for (int i = 1; i <= n; i++) //
			sum += i;	// 입력값 더하기를 n번 반복 (1부터 n까지 더하기)
				return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //스캐너 실행
		
		System.out.println("1부터 x까지의 합을 구하자."); //텍스트 출력
		int x; //변수 x 선언
		do { //x값 입력하는 실행문
			System.out.print("x의 값: ");
			x = stdIn.nextInt(); //x값 입력
		} while (x <= 0); //입력한 값이 x이하면 실행문 다시
		
		System.out.print("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
	}

}
