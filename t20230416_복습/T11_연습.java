package t20230416_복습;

import java.util.Scanner;

// 삼항(조건) 연산자 연습
// score가 >90이면 A, >80이면 B, 그 외 C

//질문: 이거 왜 반복됨?
public class T11_연습 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하세요: ");
			String str = scanner.nextLine();
			
			if(str.equals("q") || str.equals("Q")) {
				break;
			}
			
			score = Integer.parseInt(str);
			
			grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
			System.out.println(score + "점은 " + grade + "등급입니다.");
		}
		System.out.println("중지합니다.");
	}

}
