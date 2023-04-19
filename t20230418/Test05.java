package t20230418;

import java.util.Scanner;

// n단 피라미드 표시
//i행에는 (i-1) * 2 + 1개의 '*' 표시
//마지막 행(n행)에는 (n-1) * 2 + 1개의 '*'
public class Test05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?: ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) { //i=1, 조건: i는 입력값 이하, i 1 증가 / i=2
			for (int j = 1; j <= n-i; j++) //j=1, j는 n-i이하, j++ // j <= n-i <- 조건 충족하면 반복
				System.out.print(' ');
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
		

	}

}