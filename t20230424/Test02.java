package t20230424;

import java.util.Random;
import java.util.Scanner;

// 한글 요일을 영어로 맞추기
public class Test02 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new  Scanner(System.in);
		String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
		String[] dayEnglish = {"sunday", "monday", "tuesday",
				"wednesday", "thursday", "friday", "saturday"};
		
		System.out.println("요일을 영어 소문자로 입력하시오.");
		
		int retry;  //다시 한번
		int last = -1;  //이전 요일
		do { // 이하 한 번 실행하고 while이 true면 반복 실행
			int day; // 요일 설정할 변수 선언
			do { //0~6 중에 랜덤 숫자를 day 값으로 설정
				day = rand.nextInt(7);
				} while (day == last); //이전 요일과 중복이면 day 다시 설정
			last = day; // ????????????????? 위에도 있는데 왜?
			
			int action;
			do {
				System.out.print(dayKorean[day] + "요일: ");
				String s = stdIn.next(); // 글자 입력
				
				if (s.equals(dayEnglish[day])) { //입력한 글자가 영어 요일과 일치하면
					System.out.println("정답입니다."); // 정답~ 출력
					break; //끝
				}
				
				System.out.println("틀렸습니다."); // if문이 false면 "틀렸~" 출력
				
				do { //이어서, 이하 실행문 한 번 출력
					System.out.print("어떻게 할까요? 1..재입력 / 0..정답 보기: ");
					action = stdIn.nextInt(); //이때 입력한 값을 action으로 저장
					} while (action != 0 && action != 1); // 입력한 값이 0, 1이 아니면 앞 텍스트 출력
				if (action == 0) // 0 입력하면
			System.out.println(dayKorean[day] + "요일은\"" + dayEnglish[day] + "\"입니다."); //정답 보여줌
				} while (action == 1); // 입력한 값이 1이면 처음으로 돌아가서 다시 입력
										// 1이 아닌 값을 입력하면 아래 텍스트 출력
		
		System.out.print("다시 한번? 1..Yes / 0..No: ");
		retry = stdIn.nextInt();
		} while (retry == 1); // 1이면 반복, 아니면 종료?????? 종료가 안 되는데?
		
	}

}
