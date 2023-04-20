package t20230418;

import java.util.Scanner;

//1부터 n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램을 작성하라(n값을 입력받을 것)
//정숫값의 제곱 표시(방법1)
public class Test01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++)	//i값을 1로 초기화, i<=n 조건 설정, 1씩 증가하는 증감식
			// for~: n을 입력하면 1부터 n까지의 정숫값에 각 값을 제곱해서 표시할 것
			System.out.println(i + "의 제곱은 " + i * i + "입니다.");	//실행문

	}

}
