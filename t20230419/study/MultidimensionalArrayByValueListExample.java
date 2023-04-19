package t20230419.study;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] scores = { //매개변수 scores의 인덱스와 값 설정
				{80, 90, 96},
				{76, 88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 수): " + scores[1].length);
		
		//첫 번째 반의 세 번쨰 학생의 점수 읽기
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫 번쨰 반의 평균 점수 구하기
		int class1Sum = 0;	//매개변수 classSum 선언 및 값 초기화
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i]; //scores의 1반 인덱스 값 반복 합산
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
//다른방법  		System.out.printf("첫 번째 반의 평균 점수는 %.3f입니다.", class1Avg);
		
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}

}
