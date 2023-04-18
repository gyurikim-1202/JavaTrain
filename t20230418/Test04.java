package t20230418;

import java.util.Scanner;

// * 나열해서 직각 이등변 삼각형 표시
// 왼쪽 아래가 직각인 이등변 삼각형
public class Test04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //입력
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다."); //텍스트출력
		System.out.print("단수는?: "); //텍스트출력
		int n = stdIn.nextInt(); //입력값을 정수 n에 저장
		
		for (int i=1; i <= n; i++) { //초기값:i=1, 조건: i가 입력한 수 이하, 증감식: 1씩 증가
			for (int j=1; j <=i; j++) //첫번째for의실행문 = 초기값:j=1, 조건:j는 i이하, 증감식: j 1씩 증가
				System.out.print('*');
			System.out.println();
		}

	}

}
