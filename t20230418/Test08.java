package t20230418;

import java.util.Scanner;

// 정숫값을 연속해서 입력받아 합계와 평균을 구하는 프로그램(0 입력 시 프로그램 종료)
// 읽은 정숫값들을 합산(0이 입력되면 종료)
public class Test08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		
		int n = stdIn.nextInt(); //정수의 개수
		int sum = 0;	//합계
		int i;
		
		for (i=0; i < n; i++) {		// ?????
			System.out.print("정수(종료하려면 0 입력): ");
			int t = stdIn.nextInt();
			
			if (t==0) {
				break;
			}
			sum += t;
		}
		System.out.println("합계는 " + sum + "입니다.");
		if (i != 0)
			System.out.println("평균은 " + sum / i + "입니다.");
	}

}
