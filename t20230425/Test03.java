package t20230425;

import java.util.Scanner;

//인수 m에 지정한 달의 계절을 표시하는 printSeason 메소드 작성
//m값에 따라 봄(3, 4, 5), 여름(6, 7, 8), 가을(9, 10 , 11), 겨울(12, 1, 2) 표시하고
//그 이외의 값이 오면 아무것도 표시하지 않는다.
class Test03 {
	//--- m월의 계절을 표시 ---//
	static void printSeason(int m) {
		switch (m) {
		case 3: case 4: case 5: System.out.print("봄"); break;
		case 6: case 7: case 8: System.out.print("여름"); break;
		case 9: case 10: case 11: System.out.print("가을"); break;
		case 12: case 1: case 2: System.out.print("겨울"); break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int month; //입력한 달 값 저장하는 month 변수 선언
		do {
			System.out.print("몇 월입니까(1~12): ");
			month = stdIn.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.print("해당 월의 계절은 ");
		printSeason(month);
		System.out.print("입니다.");

	}

}
