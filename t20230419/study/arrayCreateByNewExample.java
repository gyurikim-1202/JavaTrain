package t20230419.study;

public class arrayCreateByNewExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3]; //배열 변수 arr1 선언, arr1의 인덱스 값을 3으로 설정
		//배열 항목의 초기값 출력
		for (int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "]: " + arr1[i] + ", "); //텍스트 + arr1의 i번째 값 출력
		}
		System.out.println(); //줄바꿈
		//배열 항목의 값 변경
		arr1[0] = 10; 
		arr1[1] = 20; 
		arr1[2] = 30;
		//배열 항목의 변경 값 출력
		for (int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "]: " + arr1[i] + ", ");
		}
		System.out.println("\n"); //줄 바꿈
		
		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3]; //실수 값이 들어올 수 있는 배열 변수 arr2 선언, 인덱스 3개 설정
		//배열 항목의 초기값 출력
		for (int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i] + ", ");
		}
		System.out.println("\n");

	}

}
