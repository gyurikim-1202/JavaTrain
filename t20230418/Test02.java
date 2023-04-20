package t20230418;

import java.util.Scanner;

//입력한 달의 계절 표시
public class Test02 {

	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		
		do {
			int month; //월 저장
			do {
				System.out.print("몇 월입니까?: "); //텍스트 실행
				month = stdId.nextInt();	//입력값을 month에 저장
			} while (month < 1 || month > 12); //"몇 월~"의 조건(이 값을 입력하면 다시 "몇 월입니까" 출력)
			
			if (month >= 3 && month <= 5)
				System.out.println("봄입니다.");
			else if (month >= 6 && month <= 8)
				System.out.println("여름입니다.");
			else if (month >= 9 && month <= 11)
				System.out.println("가을입니다.");
			else if (month == 12 || month == 1 || month ==2)
				System.out.println("여름입니다.");
			
			System.out.print("다시 하겠습니까? 1. Yes / 0. No");
			retry = stdId.nextInt();
		} while (retry == 1);

	}

}
