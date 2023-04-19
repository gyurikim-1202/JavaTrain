package t20230419.study;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 변수 선언과 배열 대입
		int[] scores = {84, 90, 96}; //인덱스 값 설정
		
		//배열 항목의 총합 구하기
		int sum = 0; //sum 초기화
		for(int i=0; i<scores.length; i++) { //i초기값0, i<scores의항목수, i+1씩
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;	//평균(실수) = 합을 scores항목개수로 나누고 실수로 바꾸기
		System.out.println("평균: " + avg);
		
	}

}
