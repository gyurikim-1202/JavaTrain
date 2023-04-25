package t20230425;

import java.util.Scanner;

//문자 c를 n개 표시하는 putChars 메소드와 이 메소드를 내부에서 호출해서 문자 '*'를 n개 표시하는 putStars메소드 작성
//그리고 이 메소드들을 사용해서 직삼각형을 만드는 프로그램 작성
class Test05 {
	//문자 c를 n개 표시하는 메소드 putChars 작성
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}
	
	//putChars을 내부에서 호출해 문자 '*'를 n개 연속 표시하는 putStars 메소드
	static void putStars(int n) {
		putChars('*', n);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 표시합니다.");
		System.out.print("단수는: ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) { //왜 i=0; i<n이 아닌가? -> 그러면 첫줄이 0(공백)이라
			putStars(i);
			System.out.println();
		}

	}

}



//문자 c를 n개 표시하는 메소드 putChars 작성
//putChars을 내부에서 호출해 문자 '*'를 n개 연속 표시하는 putStars 메소드 작성

//이 메소드들을 사용해 직삼각형 만드는 프로그램 작성
//텍스트 출력
//입력값 표시
//* 표시