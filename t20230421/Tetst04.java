package t20230421;

import java.util.Scanner;

//모든 요소의 합과 평균을 구해서 표시(확장 for문)
public class Tetst04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수: ");
		
		int n = stdIn.nextInt();   //요소 수 입력
		double[] a = new double[n]; //실수 포함하고 길이 n인 배열 a 생성
		
		//요소 합 구하기
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]");
			a[i] = stdIn.nextDouble();
		}
		
		//요소 평균 구하기
		double sum = 0;
		for (double i : a) // a값을 차례대로 double i에 넣음
			sum += i; //합 구함
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
		System.out.println("모든 요소의 평균은 " + sum / n + "입니다.");

	}

}


// 스캐너 > 텍스트 "요소 수: "
// 1. a[] n개 출력
// 2. 요소 합 구하는 함수
// 3. 요소 평균 구하는 함수
// 텍스트 출력 "모든 요소의 합은 ~" / "평균은~"