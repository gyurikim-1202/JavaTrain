package t20230414;

import java.util.Scanner;

// 3자리의 양의 정숫값
public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;				// 읽는 값
		do {
			System.out.print("세 자리의 정숫값: ");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999);
		
		System.out.print("입력한 값은 " + x + "입니다.");

	}

}
