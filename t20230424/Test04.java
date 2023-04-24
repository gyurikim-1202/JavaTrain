package t20230424;
//배열 변수의 값 표시하는 프로그램 작성
public class Test04 {

	public static void main(String[] args) {
		int[] a = new int[5]; //개수가 5인 배열 a 생성 / 이건 왜 이렇게 나오는 거지?
		System.out.println("a = " + a);
		a = null;
		System.out.println("a = " + a);

	}

}
