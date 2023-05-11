package t20230510;
//커맨드라인 인스로 부여된 모든 숫자의 합 구하기
public class SumOfArgs {
	public static void main(String[] args) {
		double sum = 0.0;
		for (String s:args)
			sum += Double.parseDouble(s);
		System.out.println("합계는 " + sum + "입니다.");

	}

}
