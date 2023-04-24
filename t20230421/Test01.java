package t20230421;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//점수를 입력받아서 합계, 평균, 최고점, 최저점 표시
		Scanner stdIn = new Scanner(System.in); //scanner 호출
		
		System.out.print("사람 수: "); //텍스트 출력
		int n = stdIn.nextInt();   //n으로 사람 수를 입력 받음
		int[] points = new int[n];  //point 인덱스 개수 n개 생성
		
		System.out.println("점수를 입력하세요");
		int sum = 0;  //합계 구하는 sum 변수 선언
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번의 점수: ");
			points[i] = stdIn.nextInt(); //points[i]를 읽는다.
			sum += points[i];	// sum에 points[i]를 더함
		}
		
		int max = points[0];  //최고점
		int min = points[0];  //최저점
		for (int i = 1; i < n; i++) {
			if (points[i] > max) max = points[i];
			if (points[i] < min) min= points[i];
		}
		
		System.out.println("합계는 " + sum + "점입니다.");
		System.out.println("평균은 " + (double)sum / n + "점입니다.");
		System.out.println("최고점은 " + max + "점입니다.");
		System.out.println("최저점은 " + min + "점입니다.");
	}

}
