package t20230419.study;

public class MultidimensionalArrayByExample {

	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3]; // mathScores의 인덱스: 1차원 2개, 2차원 3개 생성
		//배열 항목 초기값 출력
		for (int i = 0; i<mathScores.length; i++) {  //반의 수만큼 반복
			for(int k=0; k<mathScores[i].length; k++) { //mathScores[i].length=학생수 -> 해당 반의 학생 수만큼 반복
				
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
		System.out.println();
		//배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		//전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i<mathScores.length; i++) { //왜 학생 수가 아니라 반의 수만큼 반복 <----왜???????????
			totalStudent += mathScores[i].length;
			for(int k = 0; k<math )
		}
	}

}
