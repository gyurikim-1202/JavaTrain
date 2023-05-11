package t20230510;

import java.util.Scanner;

//문자열 배열을 표시하는 메서드
public class PrintStringArray {
	//문자열 배열 표시
	static void printStringArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) 
				System.out.print(a[i].charAt(j));
				System.out.println();		
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); //스캐너 불러오기
		
		System.out.print("문자열의 개수: "); //텍스트 출력
		int n = stdIn.nextInt();	//정수형 n 입력받음 - 읽은 문자열을 저장한 string형의 인스턴스를 생성하고
									//그 참조를 반환한다.
		String[] sx = new String[n];	//문자형 배열 sx의 배열 n 표시
		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		printStringArray(sx);
	}

}
