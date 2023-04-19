package t20230419.study;

import java.util.Scanner;

// 10진수를 읽어서 8진수, 16진수로 표시(방법1)
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수: ");
		int x = stdIn.nextInt();
		
		System.out.printf(" 8진수는 %o입니다.\n", x); //8진수로 출력할 때 %o / printf: 형식 문자열에 맞추어 뒤의 값을 출력
		System.out.printf("16진수는 %x입니다.\n", x); //16진수로 출력할 때 %x
	}

}
