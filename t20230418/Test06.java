package t20230418;

import java.util.Scanner;

// 양의 정숫값을 읽어서 소수인지 판정하는 프로그램 작성 - 소수 판정
public class Test06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;	//변수 선언
		do { //while(조건식)이 true일 경우 do{실행문} 반복, while false -> do~while문 종료
			System.out.print("2 이상의 정숫값: "); //텍스트 출력
			n = stdIn.nextInt(); //키보드 입력값 읽어서 n에 저장
		} while (n < 2); //입력값이 2 미만이면 "2 이상~" 텍스트 다시 출력
		
		int i; // 변수 i
		for (i = 2; i < n; i++) { // i초기값=2; i는 입력값 미만; 계산 후 i+1
			// i가 입력값n 미만이면 아래 if문 반복
			if (n % i == 0) //입력값n이 i로 나누어 떨어짐(소수가 아님)
				break; //그러면(소수 아니면) 종료
		}
		if (i == n) //i가 입력값과 같으면 
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");

	}

}
