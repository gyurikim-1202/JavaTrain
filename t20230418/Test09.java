package t20230418;

import java.util.Scanner;

//읽은 정숫값들의 합과 평균 구하기(1,000이 넘지 않는 범위에서 합산)
public class Test09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		int n = stdIn.nextInt(); //정수의 개수
		
		int sum = 0; //합계
		int i = 0;
		for (i=0; i<n; i++) {
			System.out.println("정수: ");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
			}
			sum += t;
		}
		System.out.println("합계는 " + sum + "입니다.");
		if (i != 0)
			System.out.println("평균은 " + sum / i + "입니다.");
		

	}

}

//스캐너 불러오기 > 텍스트 출력 > 키보드에 입력된 값 읽어 n에 저장 >
// for1