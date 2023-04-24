package t20230421;

import java.util.Random;
import java.util.Scanner;

// 배열의 모든 요소를 1~10의 난수로 채울 것(인접하는 요소가 동일한 값을 가지지 않도록)
public class Test06 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		// 1. 요소 개수 n 설정하는 함수
		
		//1, 2: 요소 개수 n개인 배열 a 생성
		System.out.print("요소 수: ");
		int n = stdIn.nextInt(); //요소 수 읽기
		int[] a = new int[n]; //요소가 n개인 배열 a 생성
		
		// 3. 배열 a에 1~10까지 난수 채움 (중복X)
		a[0] = 1 + rand.nextInt(10);
		
		//중복값 없을 때까지 랜덤으로 값 채우기
		for (int i = 1; i < n; i++) {
			do {
				a[i] = 1 + rand.nextInt(10);  //1~10 난수 값 생성
			} while(a[i] == a[i-1]); //생성한 다음, 요소 값이 이전 요소 값과 중복되면 실행문 중지 
		}
		
		for (int i =0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
// 스캐너 > 랜덤 함수 > 정수 입력하는 함수 > 텍스트 출력
// 1. 요소 개수 n 설정하는 함수
// 2. 배열 a 생성하는 함수
// 3. 배열 a에 1~10 난수 채우는 함수 (중복값 없이)