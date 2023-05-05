package t20230505;

public class Test01 {
	static void test(int... v) {
		System.out.print(v.length + ": "); // 배열 v의 길이 출력
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		//메소드 호출
		test(1);
		test(1, 2);
		test(1, 2, 3);

	}

}
