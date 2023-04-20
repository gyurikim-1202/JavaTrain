package t20230416_복습;

import java.util.Scanner;

// score가 90 이상이면 grade=A, 아니면 B, q or Q면 종료
public class T7_연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		char grade = 0;
		
		while(true) {
		System.out.println("점수를 입력하세요: ");
		String str = scanner.nextLine();
		
		if(str.equals("q") || str.equals("Q")) {
			break;
		}
		
		score = Integer.parseInt(str);
		if(score > 90) {
			grade = 'A';
		}
		else
			grade = 'B';
		System.out.println(score + "점은 " + grade + "입니다.");
	}
	System.out.println("종료합니다.");	
 }
}