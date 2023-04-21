package t20230421;

import java.util.Scanner;

// 선형 탐색 (방법2: 가장 끝에 있는 요소를 탐색
public class Test03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt(); //입력한 요소 수 n 저장
		int[] a = new int[n]; //배열 a 생성
		
		for (int j=0; j<n; j++) {
			System.out.print("a[" + j + "] =");
			a[j] = stdIn.nextInt();
		}
		
		System.out.print("찾을 숫자: ");
		int key = stdIn.nextInt();
		
		int i;
		for (i = n-1; i >= 0; i--)
			if (a[i] == key)
			break;

		if (i >= 0) //탐색 성공
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		
		else //탐색 실패
			System.out.println("해당 값이 존재하지 않습니다.");
		
	}

}

// 스캐너 > 요소 수: 텍스트 > 변수 n 선언화고 nextint > 값이 n개인 배열 a 생성
// 배열 a에 값 입력하는 함수 작성: