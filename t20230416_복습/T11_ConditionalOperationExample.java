package t20230416_복습;
// 삼항(조건) 연산자
public class T11_ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'c');
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
