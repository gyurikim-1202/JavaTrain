package t20230421;

import java.util.Scanner;

public class Test02 {
// 선형 탐색(방법1: 가장 앞에 있는 요소를 탐색)
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();  //요소 수 입력		
		int[] a = new int[n];   //길이가 n인 배열 a 생성
		
		for (int j = 0; j < n; j++) { //a[] 목록을 n만큼 표시
			System.out.print("a[" + j + "] = ");
			a[j] = stdIn.nextInt(); 
		}
		
		System.out.print("찾을 숫자: ");
		int key = stdIn.nextInt(); //입력한 숫자 = 찾을 숫자 = key
		
		int i;
		for (i = 0; i < n; i++) //i를 1씩 n번 증가
			if (a[i] == key) //입력한 key값이 a인덱스 값과 같으면 
				break; //멈춰
		
		if (i < n)
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");

	}

}

// 1. 특정 값을 가지는 요소 찾기
// 스캐너 > 텍스트 > n 선언 > 배열이 n인 인덱스 a 만들기 > 인덱스 값 n개 입력하는 함수 생성
// 2. 숫자(key) 찾는 함수 생성
// 텍스트 > 
// 3. 가장 앞에 위치한 요소 찾는 함수
// 4. 가장 뒤에 있는 요소 찾는 함수