package t20230421;

import java.util.Random;
import java.util.Scanner;

//배열의 모든 요소에 1~10의 난수 채우기
public class Test05 {

	public static void main(String[] args) {
		Random rand = new Random(); //난수 입력하는 스캐너
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt(); //요소 수 읽기
		int[] a = new int[n]; //입력값만큼의 길이를 갖는 배열 a 생성
		
		//모든 요소에 1~10 난수 대입
		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);
		//1~10 난수 << random.nextInt에 10을 넣었는데 왜 1을 더하는 건지 모르겠음
		//답: rand.nextInt(10)은 1~10이 아니라 0~9임
		
		for(int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}


// 스캐너 > 텍스트 "요소 수: "
// 1. 요소가 int(정수)형인 배열 생성
// 2. 모든 요소에 1~10 난수 대입