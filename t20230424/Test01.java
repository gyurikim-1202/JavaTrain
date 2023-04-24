package t20230424;

import java.util.Random;
import java.util.Scanner;

//요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램 작성
// 1. 요일은 난수를 사용해 생성, 2. 학습자가 원하는 만큼 반복, 3. 동일 요일을 연속해서 표시하지 말 것
public class Test01 {

	public static void main(String[] args) {
		Random rand = new Random();  //랜덤 메소드
		Scanner stdIn = new Scanner(System.in); //스캐너 불러오기
		String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"}; //한국어 요일 인덱스 생성
		String[] dayEnglish = {"sunday", "monday", "tuesday",
				"wednesday", "thursday", "friday", "saturday"}; //영어 요일 인덱스 생성
		
		System.out.println("요일을 영어 소문자로 입력하시오.");  //입력
		
		int retry;  //다시 한번 <- 변수 선언
		int last = -1;  //이전 요일 <- 이전 요일 중복 피하는 함수를 만들기 위한 변수 선언
		
		do { //일단 한 번은 실행
			int day;  //표시할 요일: 0~6의 난수
			do {
				day = rand.nextInt(7); //0~6에 해당하는 요일을 day로 랜덤 출력
			} while (day == last);  //day 값이 앞의 값과 중복(int last = -1)이면 실행문 다시
			
			
			
			last = day;  // <- ????? 이게 무슨 구조인지 모르겠음. 위에 day == last 있는데 왜 또?
			
			while (true) {
				System.out.print(dayKorean[day] + "요일: ");
				String s = stdIn.next(); //영어 소문자 요일 입력값
				
				if (s.equals(dayEnglish[day])) break; //정답이면 중지
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No: ");
			retry = stdIn.nextInt(); //1 or 0 입력
		} while (retry == 1); //1 누르면 do실행문 반복

	
	}
}