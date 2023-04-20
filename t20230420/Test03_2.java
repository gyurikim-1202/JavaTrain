package t20230420;
//0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시(반복을 int형으로 제어)
public class Test03_2 {

	public static void main(String[] args) {
		System.out.println(" x    x의 제곱");
		System.out.println("--------------");
		
		for (int i=0; i<=1000; i++) { //i 1씩 증가 -> 1000번 반복
			float x = (float) i / 1000; //실수x = 횟수/1000
			System.out.printf("%5.3f     %10.7f\n", x, x * x);
		}

	}

}
