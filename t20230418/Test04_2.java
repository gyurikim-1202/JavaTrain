package t20230418;

import java.util.Scanner;

//* 나열해서 직각 이등변 삼각형 표시
//왼쪽 위가 직각인 이등변 삼각형
public class Test04_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("단수는?: ");
		int n = stdIn.nextInt();
		
		for (int i=1; i <= n; i++) {
			for (int j=1; j <= n-i+1; j++)
				System.out.print("*");
			System.out.println();
					
	}

  }
}


// 입력 > 텍스트출력 > 값 저장 > for(반복조건) { for(출력할값) } > 출력할문자