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
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
		

	}

}


// 입력 > 텍스트 출력 > n값 저장
// for1 (i=1; i<=n; i++) / 공백 출력 for2 (j=i; j=)