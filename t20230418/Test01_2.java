package t20230418;

import java.util.Scanner;

//1부터 n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램을 작성하라(n값을 입력받을 것)
//정숫값의 제곱 표시(방법2)
public class Test01_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = stdIn.nextInt();
		for (int i = 1, j = 1; i <= n; i++, j = i * i)
			// 초기값: i=1 j=1; 조건: 1~n까지; 1씩 증가, 제곱
			System.out.println(i + "의 제곱은 " + j + "입니다.");

	}

}
